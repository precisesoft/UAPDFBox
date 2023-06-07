package com.wi.test.util;

import java.io.ByteArrayOutputStream;
import org.apache.pdfbox.contentstream.PDFStreamEngine;
import org.apache.pdfbox.contentstream.operator.Operator;
import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExtractEmbeddedImages extends PDFStreamEngine {
    private final PDDocument document;
    private final PDPage page;

    public final ArrayList<ByteArrayOutputStream> imageStreams = new ArrayList<ByteArrayOutputStream>();
    
    // Constructor
    public ExtractEmbeddedImages(PDDocument document, PDPage page){
    	this.document = document;
    	this.page = page;
    }

    // Execute
    public void execute(){
        try{            
            PDDocument document = this.document;
            PDPage page = this.page;

            processPage(page);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void processOperator(Operator operator, List<COSBase> operands) throws IOException{
        String operation = operator.getName();

        if("Do".equals(operation)){
            COSName objectName = (COSName) operands.get(0);
            PDXObject pdxObject = getResources().getXObject(objectName);

            if(pdxObject instanceof PDImageXObject){
                // Image
                PDImageXObject image = (PDImageXObject) pdxObject;
                BufferedImage bImage = image.getImage();
                
                var ostr = new ByteArrayOutputStream();
                
                ImageIO.write(bImage, "JPEG", ostr);
                this.imageStreams.add(ostr);

            }else if(pdxObject instanceof PDFormXObject){
                PDFormXObject form = (PDFormXObject) pdxObject;
                showForm(form);
            }
        }

        else super.processOperator(operator, operands);
    }
}
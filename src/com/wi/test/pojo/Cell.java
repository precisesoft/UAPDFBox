package com.wi.test.pojo;

import java.awt.Color;

public class Cell {
    private String rbVal = "";
    private String textVal = "";
    private int fontSize = 10;
    private float width = 0;
    private String text = "";
    private String align = "CENTER";
    private Color cellColor = null;
    private Color textColor = null;
    private Color borderColor = null;
    private TableCellMarkup cellMarkup = null;

    private float opacity = 1f;
    
    public Cell(String text, int fontSize, float width, String align, String rbVal, String textVal, TableCellMarkup cellMarkup) {
        this.text = text;
        this.fontSize = fontSize;
        this.cellColor = Color.white;
        this.textColor = Color.black;
        this.borderColor = Color.black;
        this.width = width;
        this.align = align;
        this.rbVal = rbVal;
        this.textVal = textVal;
        this.cellMarkup = cellMarkup;
    }

    public Cell(String text, int fontSize, float width, String align, String textVal, TableCellMarkup cellMarkup) {
        this.text = text;
        this.fontSize = fontSize;
        this.cellColor = Color.white;
        this.textColor = Color.black;
        this.borderColor = Color.white;
        this.width = width;
        this.align = align;
        this.textVal = textVal;
        this.cellMarkup = cellMarkup;
    }

    public Cell(String text, int fontSize, float width, String align, TableCellMarkup cellMarkup) {
        this.text = text;
        this.fontSize = fontSize;
        this.cellColor = Color.white;
        this.textColor = Color.black;
        this.borderColor = Color.black;
        this.width = width;
        this.align = align;
        this.cellMarkup = cellMarkup;
    }

    public Cell(String text, Color cellColor, int fontSize, float width, String align, TableCellMarkup cellMarkup) {
        this.text = text;
        this.fontSize = fontSize;
        this.cellColor = cellColor;
        this.textColor = Color.black;
        this.borderColor = Color.black;
        this.width = width;
        this.align = align;
        this.cellMarkup = cellMarkup;
    }

    public Cell(String text, Color cellColor, Color borderColor, int fontSize, float width, String align, TableCellMarkup cellMarkup) {
        this.text = text;
        this.fontSize = fontSize;
        this.cellColor = cellColor;
        this.textColor = Color.black;
        this.borderColor = borderColor;
        this.width = width;
        this.align = align;
        this.cellMarkup = cellMarkup;
    }

    public Cell(String text, Color cellColor, Color textColor, int fontSize, float width, String align) {
        this.text = text;
        this.fontSize = fontSize;
        this.cellColor = cellColor;
        this.textColor = textColor;
        this.borderColor = Color.WHITE;
        this.width = width;
        this.align = align;
        this.cellMarkup = new TableCellMarkup();
    }

    public Cell(String text, Color cellColor, Color textColor, float opacity, int fontSize, float width, String align) {
        this.text = text;
        this.fontSize = fontSize;
        this.cellColor = cellColor;
        this.textColor = textColor;
        this.borderColor = Color.WHITE;
        this.opacity = opacity;
        this.width = width;
        this.align = align;
        this.cellMarkup = new TableCellMarkup();
    }


    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Color getCellColor() {
        return cellColor;
    }

    public void setCellColor(Color cellColor) {
        this.cellColor = cellColor;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getRbVal() {
        return rbVal;
    }

    public void setRbVal(String rbVal) {
        this.rbVal = rbVal;
    }

    public String getTextVal() {
        return textVal;
    }

    public void setTextVal(String textVal) {
        this.textVal = textVal;
    }

    public TableCellMarkup getCellMarkup() {
        return cellMarkup;
    }

    public void setCellMarkup(TableCellMarkup cellMarkup) {
        this.cellMarkup = cellMarkup;
    }

    public float getOpacity() {
    	return this.opacity;
    }
    
    public void setOpacity(float value) {
    	this.opacity = value;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ \n");
        sb.append("\t\"Text\": \"");
        sb.append(getText());
        sb.append("\", \n");
        sb.append("\t\"Width\": \"");
        sb.append(getWidth());
        sb.append("\", \n");
        sb.append("\t\"FontSize\": \"");
        sb.append(getFontSize());
        sb.append("\", \n");
        sb.append("\t\"Align\": \"");
        sb.append(getAlign());
        sb.append("\", \n");
        sb.append("\t\"TextColor\": \"");
        sb.append(getTextColor());
        sb.append("\", \n");
        sb.append("\t\"BorderColor\": \"");
        sb.append(getBorderColor());
        sb.append("\", \n");
        sb.append("\t\"CellColor\": \"");
        sb.append(getCellColor());
        sb.append("\", \n");
        sb.append("}");
        return sb.toString();
    }
}

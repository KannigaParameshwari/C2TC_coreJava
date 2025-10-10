package com.tnsif.dayfive.multilevelinheritance.texteditor;
public class NotePad {
    protected String content;

    public NotePad() {
        this.content = "";
    }

    public void write(String text) {
        content += text; //content = content+text
    }

    public void displayContent() {
        System.out.println("Notepad Content: " + content);
    }
    
    
    /*
     * returntype funcName()
     * {
     * 		//statement
     * }
     * 
     * */
}
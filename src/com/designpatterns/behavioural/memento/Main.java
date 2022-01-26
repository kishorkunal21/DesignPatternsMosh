package com.designpatterns.behavioural.memento;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Editor editor = new Editor("text1","heading1");
        editor.setText("text2");
        editor.setHeading("heading2");
        editor.setText("text3");
        editor.setHeading("Heading3");

        System.out.println("Last : "+ editor.getText()+" "+ editor.getHeading());
        System.out.println("undo : "+ editor.undo());
        System.out.println("undo : "+ editor.undo());
        System.out.println("undo : "+ editor.undo());
        System.out.println("undo : "+ editor.undo());
        System.out.println("undo : "+ editor.undo());
        System.out.println("undo : "+ editor.undo());

        System.out.println(editor.getText()+" "+ editor.getHeading());



    }
}

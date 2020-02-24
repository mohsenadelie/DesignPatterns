package com.adeli.memento;


public class Main {

    public static void main(String[] args) {
	    Editor editor = new Editor();
	    History history = new History();

	    editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("B");
        history.push(editor.createState());

        editor.setContent("C");
        editor.restore(history.pop());

        System.out.println(editor.getContent()); // It should be "B"
    }
}

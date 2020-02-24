package com.adeli.state;

/**
 * Use of Open Closed Principle
 */
public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}

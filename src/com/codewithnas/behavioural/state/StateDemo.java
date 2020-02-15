package com.codewithnas.behavioural.state;

public class StateDemo {

    public static void main(String[] args) {
        var canvas = new Canvas();
        //canvas.setCurrentTool(new SelectionTool());
        //canvas.setCurrentTool(new BrushTool());
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}

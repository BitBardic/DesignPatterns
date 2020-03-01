package com.codewithnas.behavioural.mediator.using_observer;

public class MediatorDemo {
    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}

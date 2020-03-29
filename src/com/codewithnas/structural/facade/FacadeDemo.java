package com.codewithnas.structural.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Hello World", "target");
    }
}

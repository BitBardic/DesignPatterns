package com.codewithnas.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        // Decorating stream with different implementation
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}

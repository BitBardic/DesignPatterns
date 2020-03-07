package com.codewithnas.behavioural.chainOfResponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // authenticator -> logger -> compressor -> encryptor
        // authenticator -> compressor -> encryptor
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        //var logger = new Logger(compressor);
        var authenticator = new Authenticator(compressor);
        var server = new WebServer(authenticator);

        server.handle(new HttpRequest("admin", "1234"));
    }
}

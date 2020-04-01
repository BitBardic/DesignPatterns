package com.codewithnas.structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = { "a", "b", "c" };
        for (var fileName: fileNames) {
            // we have a problem creating real ebook object as this is costly operation.
            //library.add(new RealEbook(fileName));
            library.add(new EbookProxy(fileName));
        }

        library.openEbook("a");
        library.openEbook("b");
    }
}

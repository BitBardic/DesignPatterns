package com.codewithnas.behavioural.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        // constructor injection
     /*var imageStorage = new ImageStorage(
             new JpegCompressor(), new BlackAndWhiteFilter()
     );

     imageStorage.store("a");*/

        var imageStorage = new ImageStorage();
        // method injection
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());
    }
}

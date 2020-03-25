package com.codewithnas.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        //imageView.apply(new VividFilter());

        // Adapter Pattern implemented through Composition
        //imageView.apply(new CaramelFilter(new Caramel()));

        //Adapter Pattern implemented through Inheritance
        // But prefer composition over inheritance where possible
        imageView.apply(new CaramelAdapter());
    }
}

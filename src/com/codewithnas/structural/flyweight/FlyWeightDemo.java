package com.codewithnas.structural.flyweight;

public class FlyWeightDemo {
    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints())
            point.draw();
    }
}

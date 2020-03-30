package com.codewithnas.structural.flyweight;

public class Point {
    private int x; // 4 bytes
    private int y; // 4 bytes
    //private PointType type; // 4 bytes
    //private byte[] icon; // 20 KB  -> 20 MB ( In mobile app this is quite a generous memory if you have to draw a 1000 of points app can crash)
    private PointIcon icon;

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void draw() {
        System.out.printf("%s at (%d, %d)", this.icon.getType(), x, y);
    }
}

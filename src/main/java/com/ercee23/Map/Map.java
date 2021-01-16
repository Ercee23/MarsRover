package com.ercee23.Map;

public class Map {

    public int width;
    public int height;
    public static Map map;

    private Map(int width, int height) {
        this.width = width;
        this.height = height;
        map = this;
    }

    public static Map getMap(int width, int height) throws Exception {
        if (map == null) {
            map = new Map(width, height);
        }
        return map;
    }

    public static Map getMap() {
        return map;
    }

}
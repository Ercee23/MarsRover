package com.ercee23.Map;

import org.junit.Test;

public class MapTest {

    @Test
    public void MapGetMapTest() throws Exception {
        Map map1 = Map.getMap(5,5);
        Map map2 = Map.getMap();

        assert(map1==map2);
    }

}

package controller;

import java.util.HashMap;
import java.util.Map;

public class DicImpl implements DicInterface{

    private static Map<String, String> map;

    static {
        map = new HashMap<>();
        map.put("Hello", "Xin Chao");
        map.put("Dog", "Con Cho");
        map.put("Cat", "Con Meo");
    }

    @Override
    public Map<String, String> findAll() {
        return map;
    }

    @Override
    public String findVN(String eng) {
        return map.get(eng);
    }
}

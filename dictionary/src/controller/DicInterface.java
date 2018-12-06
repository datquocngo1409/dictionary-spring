package controller;

import java.util.List;
import java.util.Map;

public interface DicInterface {
    Map<String, String> findAll();

    String findVN(String eng);
}

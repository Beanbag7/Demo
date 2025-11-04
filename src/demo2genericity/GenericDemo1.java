package demo2genericity;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("10");
        list.add("true");
        list.add("java.lang.Object");
        for (int i = 0; i < list.size(); i++){
            Object object = list.get(i);
            System.out.println(object);
            String s = (String) list.get(i);
            System.out.println(s);
        }
    }
}

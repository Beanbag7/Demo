package demo6collection;

import java.util.*;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //Collection提供的通用功能
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c.size());
        System.out.println(c.contains("java"));
        System.out.println(c.remove("hello"));

        //集合转数组
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr));

        String[] arr1 = c.toArray(String[]::new);
    }
}

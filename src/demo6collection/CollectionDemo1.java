package demo6collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //Collection集合的整体特点
        //1.List集合特点： 有序、可重复、有索引

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println( list
        );
        //2.Set集合特点：无序 、不可重复 、无索引
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        System.out.println(set);
    }
}

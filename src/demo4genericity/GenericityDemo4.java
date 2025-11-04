package demo4genericity;

import java.util.ArrayList;

public class GenericityDemo4 {
    public static void main(String[] args) {
        String[] names = {"张三", "李四", "王五"};
        printArray( names);
        Integer[] ages = {18, 20, 19};
        printArray(ages);
    }
    public static<T> T printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
        return null;
    }
}

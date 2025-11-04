package demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo3 {
    public static void main(String[] args) {
        //Collection的遍历方式一：迭代器遍历
        Collection<String> names = new ArrayList<>();
        names.add("张三");
        names.add("玄冥二老");
        names.add("张三丰");
        // 获取迭代器对象
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}

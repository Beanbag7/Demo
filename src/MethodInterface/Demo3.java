package MethodInterface;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        //英文名字
        String[] names={"Andy" , "Bob", "Candy", "Danny", "Eric", "Fred", "Gary", "Harry", "Ivan", "Jimmy", "Kevin", "Lucy", "Mike", "Nancy", "Olivia", "Peter", "Quinn", "Ricky", "Susan", "Tom", "Ursula", "Victor", "Wendy", "Xavier", "Yvonne",};
        Arrays.sort(names, (String::compareToIgnoreCase));
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

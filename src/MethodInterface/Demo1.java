package MethodInterface;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("张三", 18, 180);
        students[1] = new Student("李四", 20, 165);
        students[2] = new Student("王五", 19, 170);
        students[3] = new Student("赵六", 18, 190);
        students[4] = new Student("孙七", 15, 175);
        students[5] = new Student("周八", 24, 168);
//        Arrays.sort(students,(o1,o2)->Student.compareByAge(o1,o2));
        Arrays.sort(students,Student::compareByAge);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}

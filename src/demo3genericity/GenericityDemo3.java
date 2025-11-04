package demo3genericity;

public class GenericityDemo3 {
    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        studentData.add(new Student("张三", 18, 180));
        studentData.add(new Student("李四", 20, 165));
    }
}

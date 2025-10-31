package innerClass;

public class Test4 {
    public static void main(String[] args) {

        Student[] students = new Student[6];
        students[0] = new Student("张三", 18, 180);
        //别插一样的数据
        students[1] = new Student("aa", 18, 122);
        students[2] = new Student("ss", 118, 11);
        students[3] = new Student("dd", 118, 23);
        students[4] = new Student("ff", 118, 23);
        students[5] = new Student("gg", 118, 23);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}

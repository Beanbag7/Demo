package MethodInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student
{
    private String name;
    private int age;
    private  double height ;
    public static int compareByAge(Student s1,Student s2)
    {
        return s1.getAge()-s2.getAge();
    }
    public int compareByHeight(Student s1,Student s2)
    {
        return Double.compare(s1.getHeight(),s2.getHeight());
    }
}

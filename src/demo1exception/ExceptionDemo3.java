package demo1exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            saveAge(-10);
        } catch (AgeIllegalException e) {
            throw new RuntimeException(e);
        }
        System.out.println("程序结束");
        //举例一个非法异常
    }
    public static  void saveAge( int age) throws AgeIllegalException {
        if (age < 0|| age > 200){
            throw new AgeIllegalException("年龄不合法");
        }
        else {
            System.out.println("保存年龄成功");
        }
    }
}

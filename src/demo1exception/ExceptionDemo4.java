package demo1exception;

public class ExceptionDemo4 {
    //认识自定义异常-运行时异常
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            saveAge(-10);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("程序结束");
        //举例一个非法异常
    }
    public static  void saveAge( int age)  {
        if (age < 0|| age > 200){
            throw new AgeIllegalRunTimeException("年龄不合法");
        }
        else {
            System.out.println("保存年龄成功");
        }
    }
}

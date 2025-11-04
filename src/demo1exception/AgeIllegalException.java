package demo1exception;
/*
* 自定义的编译时异常
* 继承Exception
* 重写Exception的构造方法
* 抛出
* */
public class AgeIllegalException extends  Exception {

    public AgeIllegalException() {
        super();
    }
    public AgeIllegalException(String message) {
        super(message);
    }
}

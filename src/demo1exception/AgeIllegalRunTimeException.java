package demo1exception;
/*
* 自定义的编译时异常
*
* 重写Exception的构造方法
* 抛出
* */
public class AgeIllegalRunTimeException extends  RuntimeException {
    public AgeIllegalRunTimeException() {
        super();
    }
    public AgeIllegalRunTimeException(String message) {
        super(message);
    }
}

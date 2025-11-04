package StringDemo;

public class StringDemo2 {
    public static void main(String[] args) {
        System.out.println("请输入验证码位数：");
        int n = new java.util.Scanner(System.in).nextInt();
        String code = getCode(n);
        System.out.println("验证码是：" + code);
        //目标：生成验证码
    }
        //生成指定位数的随机验证码，可能是大小写的字母或者数字
    public static String getCode(int n){
        //生成随机数，范围是0-35
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //创建一个String变量，保存生成的验证码
        String code = "";
        //循环n次，生成指定长度的验证码
        for(int i = 0; i < n; i++){
            int index = (int)(Math.random() * str.length());
            //获取随机数对应的字符
            char ch = str.charAt(index);
            //拼接字符串
            code += ch;
        }
        return code;
    }

}

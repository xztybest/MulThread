package MulThread;
import java.util.Scanner;
public class getUsersInput {
    //获取单个整数输入
    public static void getSingleinputInt(){
        int num;
        Scanner ip=new Scanner(System.in);
        System.out.println("请输入一个数字/please input a number");
        num=ip.nextInt();
        System.out.println("输入的数字是/the input number is :"+num);
        ip.close();
    }
    //获取多个整数输入
    public static void getMultiInputInt(){
        int num1, num2;
        Scanner ip1 = new Scanner(System.in);
        System.out.print("请输入数字1/Enter num1: ");
        num1 = ip1.nextInt();
        System.out.print("请输入数字2/Enter num2: ");
        num2 = ip1.nextInt();
        System.out.println("输入的数字1是/The input number is " + num1);
        System.out.println("输入的数字1是/The input number is " + num2);
        ip1.close();
    }
    //获取单个字符串
    public static void getSingleStr(){
        String str;
        Scanner ip2 = new Scanner(System.in);
        System.out.println("请输入字符串/Enter a string: ");
        str = ip2.nextLine();
        System.out.println("输入的字符串是/The input string is " + str);
        ip2.close();

    }
    //获取多个字符串
    public static void getMultiStr(){
        String str1, str2, str3;
        Scanner ip3 = new Scanner(System.in);
        System.out.println("输入字符串1/Enter string1: ");
        str1 = ip3.nextLine();
        System.out.println("输入字符串2/Enter string2: ");
        str2 = ip3.nextLine();
        System.out.println("输入字符串3/Enter string3: ");
        str3 = ip3.nextLine();
        System.out.println("输入的字符串1是/str1 is " + str1);
        System.out.println("输入的字符串2是/str2 is " + str2);
        System.out.println("输入的字符串3是/str3 is " + str3);
        ip3.close();
    }
    public static void main(String[] args){
        //以下只能单个输入输出测试，请自行注释掉其它调用
        getSingleinputInt();
        getMultiInputInt();
        getSingleStr();
        getMultiStr();
    }

}

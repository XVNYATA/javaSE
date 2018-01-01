//1.
import java.util.Scanner;

public class TestScanner
{
    public static void main(String[] args)
    {
        //2.
        Scanner s = new Scanner( System.in );

        //3.
        String input = s.next();

        //打印用户输入的内容
        System.out.println( "用户输入的信息是：" + input );

        System.out.println("请输入一个整数：");
        int i1 = s.nextInt();
        System.out.println( "用户输入的整数" + i1 );
    }
}

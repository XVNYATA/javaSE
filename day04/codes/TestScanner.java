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

        //��ӡ�û����������
        System.out.println( "�û��������Ϣ�ǣ�" + input );

        System.out.println("������һ��������");
        int i1 = s.nextInt();
        System.out.println( "�û����������" + i1 );
    }
}

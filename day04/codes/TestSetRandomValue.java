//1.
import java.util.Random;

public class TestSetRandomValue
{
    public static void main(String[] args)
    {
        //ʹ�ö�̬��ʼ���ķ�ʽ������һ������
        int[] arr = new int[ 20 ];

        //2.
        Random r = new Random();

        //ѭ������������������ 20~39 ֮���˳��ֵ
        for( int i = 0; i < arr.length; i++ )
        {

            //3.
            // ����int������������ֵ
            //int t = r.nextInt();

            //���� 0~100 ֮�䣬����0��������100�����ֵ
            //  t >= 0 && t < 100
            int t = r.nextInt( 100 );


            // i ��ֵ����0~19
            arr[i] = t;
        }



        for( int i = 0; i < arr.length; i++ )
        {
            System.out.println( arr[i] );
        }
    }
}

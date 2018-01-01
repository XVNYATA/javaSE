//1.
import java.util.Random;

public class TestSetRandomValue
{
    public static void main(String[] args)
    {
        //使用动态初始化的方式，创建一个数组
        int[] arr = new int[ 20 ];

        //2.
        Random r = new Random();

        //循环，给数组里面填上 20~39 之间的顺序值
        for( int i = 0; i < arr.length; i++ )
        {

            //3.
            // 生成int里面的任意随机值
            //int t = r.nextInt();

            //生成 0~100 之间，包括0，不包括100的随机值
            //  t >= 0 && t < 100
            int t = r.nextInt( 100 );


            // i 的值就是0~19
            arr[i] = t;
        }



        for( int i = 0; i < arr.length; i++ )
        {
            System.out.println( arr[i] );
        }
    }
}

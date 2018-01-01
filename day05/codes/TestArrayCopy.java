//Arrays是java.util下面的，所以必须import
import java.util.Arrays;

public class TestArrayCopy
{
    public static void main(String[] args)
    {
        int[] ori = new int[]{1,2,3,4,5,6};

        // 把ori数组复制产生一个新的数组，并且新数组的长度为20。
        // 方法会产生一个新的数组，并返回，所以需要在左边使用等号把返回值赋予给一个变量保存起来。
        // 因为方法的返回值类型是 int[] ，所以等号左边的变量的数据类型必须是 int[] 。
        int[] arr = Arrays.copyOf( ori, 20 );


        System.out.println( ori );
        System.out.println( arr );

        System.out.println( arr.length );//20

        for( int x : arr )
        {
            // 输出6以后，会输出一堆的0
            System.out.print( x );
            System.out.print( "," );
        }
    }
}

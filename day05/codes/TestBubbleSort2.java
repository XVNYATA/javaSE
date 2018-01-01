import java.util.Random;
import java.util.Arrays;
//冒泡排序的性能测试
public class TestBubbleSort2
{
    public static void main(String[] args)
    {
        // 准备10万个随机数，进行排序
        Random r = new Random();
        int[] arr = new int[ 10 * 10000 ];
        for(int i = 0; i < arr.length; i++)
        {
            // 产生一个随机数，把随机数赋予给arr的i位置
            int t = r.nextInt();
            arr[i] = t;
        }

        //在算法开始之前，记录当前的时间毫秒数
        //System是一个类，这个类里面有一个静态方法，可以获取当前时间的毫秒数（currentTimeMillis）
        long start = System.currentTimeMillis();

        //2.循环长度减一次
        for( int y = 0; y < arr.length - 1; y++)
        {

            //1.循环数组长度减一次，把最大的数放在最右边
            //1.1.循环
            // 3.
            for( int i = 0; i < arr.length - 1 - y; i++ )
            {
                int left = arr[i];//左边
                int right = arr[ i + 1 ];//右边

                //1.2.比较相邻的两个数字
                if( left > right )
                {
                    //1.3.如果左边的比右边的大，交换位置
                    arr[i] = right;
                    arr[i + 1] = left;
                }
            }
        }

        //算法结束的时候，又获取一个当前时间的毫秒数
        long end = System.currentTimeMillis();
        //使用结束时间的毫秒数，减去开始时间的毫秒数，得到时间差，就是算法需要的时长
        long time = end - start;
        System.out.println( "耗时 : " + time + " 毫秒");
    }
}






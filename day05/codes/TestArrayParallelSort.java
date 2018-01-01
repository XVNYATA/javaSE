import java.util.Random;
import java.util.Arrays;
//使用并行API排序的性能测试
public class TestArrayParallelSort
{
    public static void main(String[] args)
    {
        // 准备10000万个随机数，进行排序
        Random r = new Random();
        int[] arr = new int[ 10000 * 10000 ];
        for(int i = 0; i < arr.length; i++)
        {
            // 产生一个随机数，把随机数赋予给arr的i位置
            int t = r.nextInt();
            arr[i] = t;
        }

        //在算法开始之前，记录当前的时间毫秒数
        //System是一个类，这个类里面有一个静态方法，可以获取当前时间的毫秒数（currentTimeMillis）
        long start = System.currentTimeMillis();

        //把冒泡排序是算法删除，改为调用Arrays里面的parallelSort方法进行排序
        // 1.把排序任务根据CPU的核数进行拆分，分成四个任务一起运行。需要时间。
        // 2.每个任务独立进行排序，几乎利用到 CPU 每个核 80% 的性能。
        // 3.每个任务结束后，相对是顺序的，但是组合在一起又是乱的。这时候需要合并排序。也需要时间。
        Arrays.parallelSort( arr );

        //算法结束的时候，又获取一个当前时间的毫秒数
        long end = System.currentTimeMillis();
        //使用结束时间的毫秒数，减去开始时间的毫秒数，得到时间差，就是算法需要的时长
        long time = end - start;
        System.out.println( "耗时 : " + time + " 毫秒");
    }
}






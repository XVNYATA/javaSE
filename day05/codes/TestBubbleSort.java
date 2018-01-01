import java.util.Arrays;
//冒泡排序
public class TestBubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{ 5, 4, 6, 9, 1, 3, 7 };

        //使用一个变量记录总的循环次数，内层循环每循环一次，count就累加一次。
        int count = 0;


        //2.循环长度减一次
        for( int y = 0; y < arr.length - 1; y++)
        {

            //1.循环数组长度减一次，把最大的数放在最右边
            //1.1.循环
            // 3.
            for( int i = 0; i < arr.length - 1 - y; i++ )
            {
                //累加计数器
                count ++;


                int left = arr[i];//左边
                int right = arr[ i + 1 ];//右边

                //1.2.比较相邻的两个数字
                if( left > right )
                {
                    //1.3.如果左边的比右边的大，交换位置
                    arr[i] = right;   // 左边的值，等于右边
                    arr[i + 1] = left;// 右边的值，等于左边
                }
            }

            //可以利用Arrays里面的toString方法来协助输出
            String content = Arrays.toString( arr );
            System.out.println( content );

        }

        //输出循环计数器
        System.out.println( count );
    }
}

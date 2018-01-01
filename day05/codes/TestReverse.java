import java.util.Arrays;

public class TestReverse
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6};

        System.out.println( Arrays.toString(arr) );

        //1.循环数组长度 / 2次
        for( int i = 0 ; i < arr.length / 2; i++ )
        {
            //2.把最左边的值，先保存到临时变量
            int t = arr[i];

            //3.把最右边的值，覆盖掉最左边的值
            arr[i] = arr[ arr.length - 1 - i ];

            //4.把临时变量的值，放到最右边
            arr[ arr.length - 1 - i ] = t;
        }


        System.out.println( Arrays.toString(arr) );
    }
}

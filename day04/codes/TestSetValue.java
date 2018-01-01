public class TestSetValue
{
    public static void main(String[] args)
    {
        //使用动态初始化的方式，创建一个数组
        int[] arr = new int[ 20 ];

        //循环，给数组里面填上 20~39 之间的顺序值
        for( int i = 0; i < arr.length; i++ )
        {
            // i 的值就是0~19
            arr[i] = 20 + i;
        }



        for( int i = 0; i < arr.length; i++ )
        {
            System.out.println( arr[i] );
        }
    }
}

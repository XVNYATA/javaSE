public class TestPrintArray
{
    public static void main(String[] args)
    {
        // 1.声明一个int[]类型的变量，名为arr
        // 2.使用静态初始化的方式，创建一个int[]的实例
        // 3.使用等号把int[]实例的内存地址，赋予给 arr
        int[] arr = new int[]{ 4,5,6,7,8,98,3,21,12 };

        // 循环0～arr的长度减一，0~8就是数组的索引
        // arr.length 就是9
        // 因为使用 i < 9 判断，所以 0 ~ 8是会进入循环体的
        for( int i = 0; i < arr.length; i++)
        {
            //i的值真好是 0~8，为数组的索引
            System.out.println( arr[ i ] );
        }
    }
}

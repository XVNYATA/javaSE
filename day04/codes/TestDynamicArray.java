public class TestDynamicArray
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[ 10 ];
        String[] s1 = new String[ 5 ];

        System.out.println( arr1.length );//10
        System.out.println( s1.length );  //5

        //输出arr1里面的第4个元素的值
        System.out.println( arr1[ 3 ] );//0
        System.out.println( s1[ 3 ] );  //null

        //修改里面的值
        arr1[3] = 50;
        s1[3]   = "这个是字符串";
        System.out.println( arr1[ 3 ] );//50
        System.out.println( s1[ 3 ] );  //这个是字符串
    }
}

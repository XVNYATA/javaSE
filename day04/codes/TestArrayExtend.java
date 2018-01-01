public class TestArrayExtend
{
    public static void main(String[] args)
    {
         // 使用静态初始化的方式，创建一个数组
        int[] a1 = new int[]{ 1,2,3,4,5 };

        System.out.println( a1.length );

        //需要把a1扩容为原来长度 2 倍， a1.length * 2
        //1.产生一个新的数组
        int[] temp = new int[ a1.length * 2 ];

        //2.把a1的每个元素复制到temp里面
        for( int i = 0; i < a1.length; i++)
        {
            temp[i] = a1[i];
        }

        //3.把新数组赋予给a1
        //本质是产生一个新的数组，并且原始数组被抛弃
        a1 = temp;

        System.out.println( a1.length );


        for( int i = 0; i < a1.length; i++)
        {
            System.out.print( a1[i] );
            System.out.print(",");
        }
        System.out.println();
    }
}

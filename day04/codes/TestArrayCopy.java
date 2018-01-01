public class TestArrayCopy
{
    public static void main(String[] args)
    {
        // 使用静态初始化的方式，创建一个数组
        int[] a1 = new int[]{ 1,2,3,4,5 };

        //需要两份 a1 指向的数组相同内容的副本（拷贝）

        //但是使用 等于号 直接赋值，只是把变量里面保存的内存地址复制了一份，并没有复制数组的内容。
        int[] a2 = a1;

        System.out.println( a1.length );
        System.out.println( a2.length );


        a1[0] = 10;

        //修改其中一个变量的内容，另外一个变量也会跟着发生变化。
        System.out.println( a1[0] );//10
        System.out.println( a2[0] );//10


        //为了得到两个副本，必须再次使用new产生一个新的数组，并且把原始数组的内容，一个个复制到新的数组里面。

        //1.new一个新的数组，和原始数组长度一样
        // 一旦是有 new， 必然会在堆里面产生一个区域用来存储数据
        // 因为想要完全复制a1，所以长度需要和a1一样
        int[] a3 = new int[ a1.length ];

        //2.使用循环依次把原始数组的内容，复制到新数组对应的位置
        for(int i = 0; i < a1.length; i++)
        {
            //现在就是给a3里面的元素赋值
            //值并不是随机、固定的，而是从a1里面获取的
            a3[i] = a1[i];
        }


        //如果修改a3的索引为2的数据，a1里面会改变吗？
        a3[2] = 400;

        //打印a1和a3
        for( int i = 0; i < a1.length; i++)
        {
            System.out.print( a1[i] );
            System.out.print(",");
        }
        System.out.println();

        for( int i = 0; i < a3.length; i++)
        {
            System.out.print( a3[i] );
            System.out.print(",");
        }
        System.out.println();
    }
}






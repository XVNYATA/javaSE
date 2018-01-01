public class TestMath
{
    public static void main(String[] args)
    {
        int i1 = 10;
        int i2 = 20;
        int i3 = i1 + i2;
        System.out.println( i3 ); // 30

        int i4 = i2 / i1;
        System.out.println( i4 );// 2

        int i5 = 5 / 2;
        System.out.println( i5 );// 2 ，因为int类型没有小数。小数的部分会被丢弃
        int i6 = 5 % 2;
        System.out.println( i6 );// 1， 余数是1


        //使用 % 和具体的数据类型没有关系
        //只是整除到不能整除的时候，返回余数。
        double d1 = 4.8 % 2.1;
        System.out.println( d1 );//0.6

        int i = 5;

        // i = i + 5;
        i += 5;

        System.out.println(i);//10

        // i = i / 2;
        i /= 2;
        System.out.println(i);//5

        boolean b1 = 5 > 6;//false
        boolean b2 = 5 < 6;//true

        System.out.println( b1 );
        System.out.println( b2 );
    }
}

public class TestIntVariable
{
    public static void main(String[] args)
    {
        //使用byte数据类型，定义一个名为ab的变量。
        //这个变量没有初始值，变量必须有值才能被使用。
        byte ab;

        //使用int类型，定义一个名为cd的变量。
        //并且这个变量赋予初始值100。
        int cd = 100;


        //直接输出变量
        ab = 20;//给变量赋值
        System.out.println(ab);

        System.out.println(cd);


        //不能给变量赋予超出范围的值，否则编译会报错
        //byte b1 = 200;


        //如果给整数赋予正好属于它范围的值，那么系统会自动类型转换
        byte b2 = 100;


        long x1 = 2200000000L;


        // 声明一个类型为int的变量，名为i1
        // i1的值复制了b2的值，i1=100
        int i1 = b2;

        //虽然i1的值是从b2复制的，但是已经进行了类型转换，i1里面的数据类型一定是int。

        //需要强制类型转换
        short s1 = (short)i1;
        byte b3 = (byte)i1;


        System.out.println( s1 );//100
        System.out.println( b3 );//100


    }
}





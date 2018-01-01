public class TestChar
{
    public static void main(String[] args)
    {
        // 把97存储在c1变量里面
        char c1 = 97;

        //输出c1变量。输出的时候系统发现这个是char类型的。
        //自动根据c1的值（97）到字库里面找出一个字符进行显示。
        System.out.println( c1 );// a

        char c2 = 'a';
        System.out.println( c2 );// a

        char c3 = '\'';
        System.out.println( c3 ); // '


        char c4 = '\u0061';
        System.out.println( c4 ); // a


        char c5 = 97 + 7;
        System.out.println( c5 );

        char c6 = '\u628A';
        System.out.println( c6 );

        // int占32位，char占16位，低位转高位
        // 字符就是一个数字
        int i1 = c6;
        System.out.println( i1 );
    }
}

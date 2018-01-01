//测试自加的陷阱
public class TestPlusPlus
{
    public static void main(String[] args)
    {
        int i = 1;
        // i++ 的返回值是1
        // 执行 i++ 以后，i的值是2
        i = i++;
        System.out.println( i );// 1


        //下面是一个死循环，因为x永远是0
        for( int x = 0; x < 5 ; x = x++ )
        {
            System.out.println( x );//0
        }
    }
}

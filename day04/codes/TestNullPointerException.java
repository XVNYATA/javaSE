public class TestNullPointerException
{
    public static void main(String[] args)
    {
        int[] arr = null;
        //输出数组的长度，这时因为arr没有指向实际的数据，所以会出现空指针异常。
        System.out.println( arr.length );
    }
}

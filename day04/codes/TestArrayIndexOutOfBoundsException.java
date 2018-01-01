public class TestArrayIndexOutOfBoundsException
{
    public static void main(String[] args)
    {
        int[] arr = new int[ 5 ];

        // 这个5已经是等于数组的长度，所以不能作为索引。
        // 最大的索引只能是 长度减一
        arr[ 5 ] = 100;


        // 最小的索引是0，所以负数不能作为索引值使用
        arr[-1] = 100;
    }
}

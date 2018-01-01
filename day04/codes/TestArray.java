public class TestArray
{
    public static void main(String[] args)
    {
        //使用静态初始化的方式，声明一个数组
        int[] arr = new int[]{ 45, 67, 12, 34, 99 };

        // 数组里面有多少个元素，长度就是多少。
        System.out.println( arr.length );//5

        // 索引是从0开始的，因此使用的时候需要减一。
        // 因为arr里面都是int类型，所以获取arr里面的第三个元素，需要int类型来装。
        int i1 = arr[ 2 ];
        System.out.println( i1 );//12

        //修改第四个元素的值
        arr[ 3 ] = 100;

        System.out.println( arr[3] );//直接输出变量
    }
}

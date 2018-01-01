public class Test2DArray
{
    public static void main(String[] args)
    {
        //纵向为6，表示6行。
        //横向为5，表示每行都有5列，每行的列数不是固定的。
        int[][] arr = new int[][]
        {
            {11,12,13,14,15},
            {21,22,23,24,25},
            {31,32,33,34,35},
            {41,42,43,44,45},
            {51,52,53,54,55},
            {61,62,63,64,65}
        };


        //获取arr里面的第一行，每行的数据类型都是数组
        int[] row = arr[0];

        //获取第一行第一列的值
        int first = row[0];

        int second = arr[0][0];

        //获取第一行第三列
        int i3 = row[2];
        //           y  x
        int i4 = arr[0][2];//13

        //获取第4行的第二列的值
        int i5 = arr[3][1];//42

        System.out.println( i4 );
        System.out.println( i5 );


        //使用原始的for循环遍历
        //需要使用嵌套的两层循环来遍历，其中外层循环遍历每行、内层循环遍历每个格子
        for( int y = 0; y < arr.length; y++ )
        {
            //取出一行
            int[] temp = arr[y];

            //遍历取出的行
            for( int x = 0; x < temp.length; x++ )
            {
                //同一行不要换行

                //取出一个格子的内容
                int t = temp[x];
                System.out.print( t );
                System.out.print( "\t" );
            }

            //内层循环完成，表示一行结束，就需要换行
            System.out.println();
        }


        System.out.println("===========================");
        //使用简化的for循环遍历
        for( int[] temp : arr )
        {
            for( int t : temp )
            {
                System.out.print( t );
                System.out.print( "\t" );
            }
            System.out.println();
        }


        System.out.println("===========================");
        //二维数组的动态初始化有两种形式：

        //1.指定行，不指定列
        //这种情况下，每行的值，都是null
        double[][] data = new double[5][];
        for( double[] temp : data )
        {
            System.out.println( temp );//null
        }


        //2.指定行数和列数
        //这种情况下，每行都有相同的列数
        long[][] testArray = new long[3][2];//3行2列
        for( long[] temp : testArray )
        {
            for( long t : temp )
            {
                System.out.print( t );//0
                System.out.print( "\t" );
            }
            System.out.println();
        }

    }
}







public class Test2DArray
{
    public static void main(String[] args)
    {
        //����Ϊ6����ʾ6�С�
        //����Ϊ5����ʾÿ�ж���5�У�ÿ�е��������ǹ̶��ġ�
        int[][] arr = new int[][]
        {
            {11,12,13,14,15},
            {21,22,23,24,25},
            {31,32,33,34,35},
            {41,42,43,44,45},
            {51,52,53,54,55},
            {61,62,63,64,65}
        };


        //��ȡarr����ĵ�һ�У�ÿ�е��������Ͷ�������
        int[] row = arr[0];

        //��ȡ��һ�е�һ�е�ֵ
        int first = row[0];

        int second = arr[0][0];

        //��ȡ��һ�е�����
        int i3 = row[2];
        //           y  x
        int i4 = arr[0][2];//13

        //��ȡ��4�еĵڶ��е�ֵ
        int i5 = arr[3][1];//42

        System.out.println( i4 );
        System.out.println( i5 );


        //ʹ��ԭʼ��forѭ������
        //��Ҫʹ��Ƕ�׵�����ѭ�����������������ѭ������ÿ�С��ڲ�ѭ������ÿ������
        for( int y = 0; y < arr.length; y++ )
        {
            //ȡ��һ��
            int[] temp = arr[y];

            //����ȡ������
            for( int x = 0; x < temp.length; x++ )
            {
                //ͬһ�в�Ҫ����

                //ȡ��һ�����ӵ�����
                int t = temp[x];
                System.out.print( t );
                System.out.print( "\t" );
            }

            //�ڲ�ѭ����ɣ���ʾһ�н���������Ҫ����
            System.out.println();
        }


        System.out.println("===========================");
        //ʹ�ü򻯵�forѭ������
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
        //��ά����Ķ�̬��ʼ����������ʽ��

        //1.ָ���У���ָ����
        //��������£�ÿ�е�ֵ������null
        double[][] data = new double[5][];
        for( double[] temp : data )
        {
            System.out.println( temp );//null
        }


        //2.ָ������������
        //��������£�ÿ�ж�����ͬ������
        long[][] testArray = new long[3][2];//3��2��
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







//Arrays��java.util����ģ����Ա���import
import java.util.Arrays;

public class TestArrayCopy
{
    public static void main(String[] args)
    {
        int[] ori = new int[]{1,2,3,4,5,6};

        // ��ori���鸴�Ʋ���һ���µ����飬����������ĳ���Ϊ20��
        // ���������һ���µ����飬�����أ�������Ҫ�����ʹ�õȺŰѷ���ֵ�����һ����������������
        // ��Ϊ�����ķ���ֵ������ int[] �����ԵȺ���ߵı������������ͱ����� int[] ��
        int[] arr = Arrays.copyOf( ori, 20 );


        System.out.println( ori );
        System.out.println( arr );

        System.out.println( arr.length );//20

        for( int x : arr )
        {
            // ���6�Ժ󣬻����һ�ѵ�0
            System.out.print( x );
            System.out.print( "," );
        }
    }
}

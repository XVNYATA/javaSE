import java.util.Arrays;

public class TestReverse
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6};

        System.out.println( Arrays.toString(arr) );

        //1.ѭ�����鳤�� / 2��
        for( int i = 0 ; i < arr.length / 2; i++ )
        {
            //2.������ߵ�ֵ���ȱ��浽��ʱ����
            int t = arr[i];

            //3.�����ұߵ�ֵ�����ǵ�����ߵ�ֵ
            arr[i] = arr[ arr.length - 1 - i ];

            //4.����ʱ������ֵ���ŵ����ұ�
            arr[ arr.length - 1 - i ] = t;
        }


        System.out.println( Arrays.toString(arr) );
    }
}

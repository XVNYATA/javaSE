import java.util.Random;
import java.util.Arrays;
//ð����������ܲ���
public class TestBubbleSort2
{
    public static void main(String[] args)
    {
        // ׼��10������������������
        Random r = new Random();
        int[] arr = new int[ 10 * 10000 ];
        for(int i = 0; i < arr.length; i++)
        {
            // ����һ���������������������arr��iλ��
            int t = r.nextInt();
            arr[i] = t;
        }

        //���㷨��ʼ֮ǰ����¼��ǰ��ʱ�������
        //System��һ���࣬�����������һ����̬���������Ի�ȡ��ǰʱ��ĺ�������currentTimeMillis��
        long start = System.currentTimeMillis();

        //2.ѭ�����ȼ�һ��
        for( int y = 0; y < arr.length - 1; y++)
        {

            //1.ѭ�����鳤�ȼ�һ�Σ����������������ұ�
            //1.1.ѭ��
            // 3.
            for( int i = 0; i < arr.length - 1 - y; i++ )
            {
                int left = arr[i];//���
                int right = arr[ i + 1 ];//�ұ�

                //1.2.�Ƚ����ڵ���������
                if( left > right )
                {
                    //1.3.�����ߵı��ұߵĴ󣬽���λ��
                    arr[i] = right;
                    arr[i + 1] = left;
                }
            }
        }

        //�㷨������ʱ���ֻ�ȡһ����ǰʱ��ĺ�����
        long end = System.currentTimeMillis();
        //ʹ�ý���ʱ��ĺ���������ȥ��ʼʱ��ĺ��������õ�ʱ�������㷨��Ҫ��ʱ��
        long time = end - start;
        System.out.println( "��ʱ : " + time + " ����");
    }
}






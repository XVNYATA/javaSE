import java.util.Arrays;
//ð������
public class TestBubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{ 5, 4, 6, 9, 1, 3, 7 };

        //ʹ��һ��������¼�ܵ�ѭ���������ڲ�ѭ��ÿѭ��һ�Σ�count���ۼ�һ�Ρ�
        int count = 0;


        //2.ѭ�����ȼ�һ��
        for( int y = 0; y < arr.length - 1; y++)
        {

            //1.ѭ�����鳤�ȼ�һ�Σ����������������ұ�
            //1.1.ѭ��
            // 3.
            for( int i = 0; i < arr.length - 1 - y; i++ )
            {
                //�ۼӼ�����
                count ++;


                int left = arr[i];//���
                int right = arr[ i + 1 ];//�ұ�

                //1.2.�Ƚ����ڵ���������
                if( left > right )
                {
                    //1.3.�����ߵı��ұߵĴ󣬽���λ��
                    arr[i] = right;   // ��ߵ�ֵ�������ұ�
                    arr[i + 1] = left;// �ұߵ�ֵ���������
                }
            }

            //��������Arrays�����toString������Э�����
            String content = Arrays.toString( arr );
            System.out.println( content );

        }

        //���ѭ��������
        System.out.println( count );
    }
}

import java.util.Random;
import java.util.Arrays;
//ʹ��API��������ܲ���
public class TestArraySort
{
    public static void main(String[] args)
    {
        // ׼��10000������������������
        Random r = new Random();
        int[] arr = new int[ 10000 * 10000 ];
        for(int i = 0; i < arr.length; i++)
        {
            // ����һ���������������������arr��iλ��
            int t = r.nextInt();
            arr[i] = t;
        }

        //���㷨��ʼ֮ǰ����¼��ǰ��ʱ�������
        //System��һ���࣬�����������һ����̬���������Ի�ȡ��ǰʱ��ĺ�������currentTimeMillis��
        long start = System.currentTimeMillis();

        //��ð���������㷨ɾ������Ϊ����Arrays�����sort������������
        Arrays.sort( arr );

        //�㷨������ʱ���ֻ�ȡһ����ǰʱ��ĺ�����
        long end = System.currentTimeMillis();
        //ʹ�ý���ʱ��ĺ���������ȥ��ʼʱ��ĺ��������õ�ʱ�������㷨��Ҫ��ʱ��
        long time = end - start;
        System.out.println( "��ʱ : " + time + " ����");
    }
}






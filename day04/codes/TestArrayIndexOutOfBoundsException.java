public class TestArrayIndexOutOfBoundsException
{
    public static void main(String[] args)
    {
        int[] arr = new int[ 5 ];

        // ���5�Ѿ��ǵ�������ĳ��ȣ����Բ�����Ϊ������
        // ��������ֻ���� ���ȼ�һ
        arr[ 5 ] = 100;


        // ��С��������0�����Ը���������Ϊ����ֵʹ��
        arr[-1] = 100;
    }
}

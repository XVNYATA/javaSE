public class TestPrintArray
{
    public static void main(String[] args)
    {
        // 1.����һ��int[]���͵ı�������Ϊarr
        // 2.ʹ�þ�̬��ʼ���ķ�ʽ������һ��int[]��ʵ��
        // 3.ʹ�õȺŰ�int[]ʵ�����ڴ��ַ������� arr
        int[] arr = new int[]{ 4,5,6,7,8,98,3,21,12 };

        // ѭ��0��arr�ĳ��ȼ�һ��0~8�������������
        // arr.length ����9
        // ��Ϊʹ�� i < 9 �жϣ����� 0 ~ 8�ǻ����ѭ�����
        for( int i = 0; i < arr.length; i++)
        {
            //i��ֵ����� 0~8��Ϊ���������
            System.out.println( arr[ i ] );
        }
    }
}

public class TestSetValue
{
    public static void main(String[] args)
    {
        //ʹ�ö�̬��ʼ���ķ�ʽ������һ������
        int[] arr = new int[ 20 ];

        //ѭ������������������ 20~39 ֮���˳��ֵ
        for( int i = 0; i < arr.length; i++ )
        {
            // i ��ֵ����0~19
            arr[i] = 20 + i;
        }



        for( int i = 0; i < arr.length; i++ )
        {
            System.out.println( arr[i] );
        }
    }
}

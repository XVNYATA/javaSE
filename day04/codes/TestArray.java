public class TestArray
{
    public static void main(String[] args)
    {
        //ʹ�þ�̬��ʼ���ķ�ʽ������һ������
        int[] arr = new int[]{ 45, 67, 12, 34, 99 };

        // ���������ж��ٸ�Ԫ�أ����Ⱦ��Ƕ��١�
        System.out.println( arr.length );//5

        // �����Ǵ�0��ʼ�ģ����ʹ�õ�ʱ����Ҫ��һ��
        // ��Ϊarr���涼��int���ͣ����Ի�ȡarr����ĵ�����Ԫ�أ���Ҫint������װ��
        int i1 = arr[ 2 ];
        System.out.println( i1 );//12

        //�޸ĵ��ĸ�Ԫ�ص�ֵ
        arr[ 3 ] = 100;

        System.out.println( arr[3] );//ֱ���������
    }
}

public class TestArrayCopy
{
    public static void main(String[] args)
    {
        // ʹ�þ�̬��ʼ���ķ�ʽ������һ������
        int[] a1 = new int[]{ 1,2,3,4,5 };

        //��Ҫ���� a1 ָ���������ͬ���ݵĸ�����������

        //����ʹ�� ���ں� ֱ�Ӹ�ֵ��ֻ�ǰѱ������汣����ڴ��ַ������һ�ݣ���û�и�����������ݡ�
        int[] a2 = a1;

        System.out.println( a1.length );
        System.out.println( a2.length );


        a1[0] = 10;

        //�޸�����һ�����������ݣ�����һ������Ҳ����ŷ����仯��
        System.out.println( a1[0] );//10
        System.out.println( a2[0] );//10


        //Ϊ�˵õ����������������ٴ�ʹ��new����һ���µ����飬���Ұ�ԭʼ��������ݣ�һ�������Ƶ��µ��������档

        //1.newһ���µ����飬��ԭʼ���鳤��һ��
        // һ������ new�� ��Ȼ���ڶ��������һ�����������洢����
        // ��Ϊ��Ҫ��ȫ����a1�����Գ�����Ҫ��a1һ��
        int[] a3 = new int[ a1.length ];

        //2.ʹ��ѭ�����ΰ�ԭʼ��������ݣ����Ƶ��������Ӧ��λ��
        for(int i = 0; i < a1.length; i++)
        {
            //���ھ��Ǹ�a3�����Ԫ�ظ�ֵ
            //ֵ������������̶��ģ����Ǵ�a1�����ȡ��
            a3[i] = a1[i];
        }


        //����޸�a3������Ϊ2�����ݣ�a1�����ı���
        a3[2] = 400;

        //��ӡa1��a3
        for( int i = 0; i < a1.length; i++)
        {
            System.out.print( a1[i] );
            System.out.print(",");
        }
        System.out.println();

        for( int i = 0; i < a3.length; i++)
        {
            System.out.print( a3[i] );
            System.out.print(",");
        }
        System.out.println();
    }
}






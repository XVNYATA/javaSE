public class TestArrayExtend
{
    public static void main(String[] args)
    {
         // ʹ�þ�̬��ʼ���ķ�ʽ������һ������
        int[] a1 = new int[]{ 1,2,3,4,5 };

        System.out.println( a1.length );

        //��Ҫ��a1����Ϊԭ������ 2 ���� a1.length * 2
        //1.����һ���µ�����
        int[] temp = new int[ a1.length * 2 ];

        //2.��a1��ÿ��Ԫ�ظ��Ƶ�temp����
        for( int i = 0; i < a1.length; i++)
        {
            temp[i] = a1[i];
        }

        //3.�������鸳���a1
        //�����ǲ���һ���µ����飬����ԭʼ���鱻����
        a1 = temp;

        System.out.println( a1.length );


        for( int i = 0; i < a1.length; i++)
        {
            System.out.print( a1[i] );
            System.out.print(",");
        }
        System.out.println();
    }
}

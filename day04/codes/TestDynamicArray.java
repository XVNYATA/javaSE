public class TestDynamicArray
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[ 10 ];
        String[] s1 = new String[ 5 ];

        System.out.println( arr1.length );//10
        System.out.println( s1.length );  //5

        //���arr1����ĵ�4��Ԫ�ص�ֵ
        System.out.println( arr1[ 3 ] );//0
        System.out.println( s1[ 3 ] );  //null

        //�޸������ֵ
        arr1[3] = 50;
        s1[3]   = "������ַ���";
        System.out.println( arr1[ 3 ] );//50
        System.out.println( s1[ 3 ] );  //������ַ���
    }
}

public class TestChar
{
    public static void main(String[] args)
    {
        // ��97�洢��c1��������
        char c1 = 97;

        //���c1�����������ʱ��ϵͳ���������char���͵ġ�
        //�Զ�����c1��ֵ��97�����ֿ������ҳ�һ���ַ�������ʾ��
        System.out.println( c1 );// a

        char c2 = 'a';
        System.out.println( c2 );// a

        char c3 = '\'';
        System.out.println( c3 ); // '


        char c4 = '\u0061';
        System.out.println( c4 ); // a


        char c5 = 97 + 7;
        System.out.println( c5 );

        char c6 = '\u628A';
        System.out.println( c6 );

        // intռ32λ��charռ16λ����λת��λ
        // �ַ�����һ������
        int i1 = c6;
        System.out.println( i1 );
    }
}

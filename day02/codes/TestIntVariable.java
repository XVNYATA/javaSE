public class TestIntVariable
{
    public static void main(String[] args)
    {
        //ʹ��byte�������ͣ�����һ����Ϊab�ı�����
        //�������û�г�ʼֵ������������ֵ���ܱ�ʹ�á�
        byte ab;

        //ʹ��int���ͣ�����һ����Ϊcd�ı�����
        //����������������ʼֵ100��
        int cd = 100;


        //ֱ���������
        ab = 20;//��������ֵ
        System.out.println(ab);

        System.out.println(cd);


        //���ܸ��������賬����Χ��ֵ���������ᱨ��
        //byte b1 = 200;


        //�������������������������Χ��ֵ����ôϵͳ���Զ�����ת��
        byte b2 = 100;


        long x1 = 2200000000L;


        // ����һ������Ϊint�ı�������Ϊi1
        // i1��ֵ������b2��ֵ��i1=100
        int i1 = b2;

        //��Ȼi1��ֵ�Ǵ�b2���Ƶģ������Ѿ�����������ת����i1�������������һ����int��

        //��Ҫǿ������ת��
        short s1 = (short)i1;
        byte b3 = (byte)i1;


        System.out.println( s1 );//100
        System.out.println( b3 );//100


    }
}





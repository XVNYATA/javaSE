//�߼�������Ĳ��Դ���
public class TestLogic
{
    public static void main(String[] args)
    {
        boolean b0 = false;
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;


        //�߼�������ķ��ؽ��������boolean��
        boolean b4 = b1 & b3;//true
        boolean b5 = b1 | b2;//true
        boolean b6 = b2 | b0;//false
        boolean b7 = b2 & b0;//false
        boolean b8 = b2 ^ b0;//false
        boolean b9 = b1 ^ b0;//true

        System.out.println( b4 );
        System.out.println( b5 );
        System.out.println( b6 );
        System.out.println( b7 );
        System.out.println( b8 );
        System.out.println( b9 );


        int i = 5;

        //�Լӣ�������ں��棬��ʾ��ʹ��ֵ��Ȼ�����Լӡ�
        // i = i + 1;
        i++;

        System.out.println( i );//6

        //�Ȱ�i��ֵʹ�ã�Ȼ��i�ٸ�Ϊ7
        //ʹ�õ�ʱ�򣬾��������
        System.out.println( i++ );//6
        System.out.println( i );//7

        //���Լ������(ʹ��)
        System.out.println( ++i );//8
        System.out.println( i );//8

        //�Լ����Լ����ԼӵĹ���һ����
        i--;
        System.out.println( i );//7

        int i1 = 5;
        int i2 = 6;
        int i3 = 7;
        int i4 = 8;

        System.out.println( i1++ > i2++ && i3++ < i4++ ); //false

        System.out.println( i1 );//6
        System.out.println( i2 );//7
        System.out.println( i3 );//7
        System.out.println( i4 );//8

        System.out.println( i1++ < i2++ || i3++ > i4++ ); //true

        System.out.println( i1 );//7
        System.out.println( i2 );//8
        System.out.println( i3 );//7
        System.out.println( i4 );//8
    }
}





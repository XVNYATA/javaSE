//����Random
import java.util.Random;

public class TestRanomAllChar
{
    public static void main(String[] args)
    {
        //���� A-Z��a-z��0-9�����з�Χ���ַ�
        // һ������һ�����飬�����е��ַ��������������
        char[] data = new char[ 62 ];
        for( int i = 0 ;i < 26; i++ )
        {
            //0~25֮�䣬�洢A-Z
            data[i] = (char)('A' + i);
            //26~51֮��洢��a-z
            data[i + 26] = (char)('a' + i);
            //ʣ�µ�52~61֮��洢0-9
            if( i < 10 )
            {
                data[ i + 52 ] = (char)('0' + i);
            }
        }

        System.out.print("ԭʼ����: ");
        System.out.println( data );
        // �������ɵ������������Ҫǿ��ת��Ϊchar��������Ϊ������ǰ������������ȡһ���ַ�


        //����Random��ʵ��
        Random r = new Random();

        //1.Ϊ���жϺ������ɵ��ַ����Ƿ���ǰ���Ѿ����ɹ���������������ɵ��ַ���������
        char[] cs = new char[ 6 ];

        //����A-Z֮�������6���ַ�
        for( int i = 0; i < cs.length;  )
        {
            //ÿ��ѭ��ֻ��Ҫ���� 0 ~ 61 ֮������������
            int t = r.nextInt( 62 );

            //char c = (char) ('A' + t);
            char c = data[ t ];

            //System.out.print( c );
            //2.�ж��ַ��Ƿ��Ѿ���cs�������棬��������ʾc��Ч��i���ܸı䣬��Ҫ������һ��c���ŵ�i��λ��

            //Ϊʲô j < i ��
            // �ڲ��ѭ����Ϊ���ж�c�Ƿ���cs���棬���i == 0��ʱ��cs�������û���ַ�������Ҫ�жϡ�
            // ��� i == 1 ��ʱ��cs������һ���ַ���ֻ��Ҫѭ��һ�μ����ж�c�Ƿ��cs������ַ���ȡ�
            // �ж�����ظ������޸�boolean���͵ı��� flag Ϊtrue����ʾ�ظ���
            boolean flag = false;
            for( int j = 0; j < i; j++ )
            {
                if( c == cs[j] )
                {
                    //c��cs�����ĳ���ַ����
                    flag = true;

                    //ֹͣ�����ж�
                    break;
                }
            }


            //3.�ж�flag�Ƿ�Ϊtrue�������Ϊtrue�����ʾ���ظ�
            if( flag )
            {
                //�ظ���c
                System.out.println("λ�� " + i + " �����ظ��ַ�: " + c);
            }
            else
            {
                //���ظ�����c�ŵ�cs��iλ��
                cs[i] = c;
                //i++��Ҫ�������ѭ���ĵ�������У�ֻ�е����ظ���ʱ��i���Լ�
                i++;
            }
        }

        //ֱ�Ӵ�ӡchar���飬��������ݡ���������������鲻ͬ��
        System.out.println(cs);
    }
}





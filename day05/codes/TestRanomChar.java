//����Random
import java.util.Random;

public class TestRanomChar
{
    public static void main(String[] args)
    {
        //����Random��ʵ��
        Random r = new Random();

        //1.Ϊ���жϺ������ɵ��ַ����Ƿ���ǰ���Ѿ����ɹ���������������ɵ��ַ���������
        char[] cs = new char[ 6 ];

        //����A-Z֮�������6���ַ�
        for( int i = 0; i < cs.length;  )
        {
            //ÿ��ѭ��ֻ��Ҫ���� 0 ~ 25 ֮�����������ɣ�������������ַ� A���Ϳ��Եõ�������ַ���
            int t = r.nextInt( 26 );

            char c = (char) ('A' + t);

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





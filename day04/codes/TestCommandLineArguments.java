//���������в���
public class TestCommandLineArguments
{
    // ִ�������ʱ���������   java TestCommandLineArguments  ��ô����ġ����������� 0����û����������Ϣ���
    // �������  java TestCommandLineArguments c:/a.txt d:/a.txt  ��ô��������������� 2������������������������� 
    // ���������棬����ʹ�ÿո�����������
    public static void main(String[] args)
    {
        System.out.println( "���������� " + args.length );

        for( String a : args )
        {
            System.out.println( a );
        }
    }
}

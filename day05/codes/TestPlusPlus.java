//�����Լӵ�����
public class TestPlusPlus
{
    public static void main(String[] args)
    {
        int i = 1;
        // i++ �ķ���ֵ��1
        // ִ�� i++ �Ժ�i��ֵ��2
        i = i++;
        System.out.println( i );// 1


        //������һ����ѭ������Ϊx��Զ��0
        for( int x = 0; x < 5 ; x = x++ )
        {
            System.out.println( x );//0
        }
    }
}

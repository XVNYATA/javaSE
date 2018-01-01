//导入Random
import java.util.Random;

public class TestRanomChar
{
    public static void main(String[] args)
    {
        //创建Random的实例
        Random r = new Random();

        //1.为了判断后面生成的字符，是否在前面已经生成过，必须把所有生成的字符保存起来
        char[] cs = new char[ 6 ];

        //生成A-Z之间的任意6个字符
        for( int i = 0; i < cs.length;  )
        {
            //每次循环只需要生成 0 ~ 25 之间的随机数即可，把随机数加上字符 A，就可以得到随机的字符。
            int t = r.nextInt( 26 );

            char c = (char) ('A' + t);

            //System.out.print( c );
            //2.判断字符是否已经在cs数组里面，如果在则表示c无效，i不能改变，需要再生成一个c，放到i的位置

            //为什么 j < i ？
            // 内层的循环是为了判断c是否在cs里面，如果i == 0的时候，cs里面根本没有字符，不需要判断。
            // 如果 i == 1 的时候，cs里面有一个字符，只需要循环一次即可判断c是否和cs里面的字符相等。
            // 判断如果重复，则修改boolean类型的变量 flag 为true，表示重复。
            boolean flag = false;
            for( int j = 0; j < i; j++ )
            {
                if( c == cs[j] )
                {
                    //c和cs里面的某个字符相等
                    flag = true;

                    //停止继续判断
                    break;
                }
            }


            //3.判断flag是否为true，如果不为true，则表示不重复
            if( flag )
            {
                //重复的c
                System.out.println("位置 " + i + " 生成重复字符: " + c);
            }
            else
            {
                //不重复，把c放到cs的i位置
                cs[i] = c;
                //i++不要放在外层循环的迭代语句中，只有当不重复的时候，i才自加
                i++;
            }
        }

        //直接打印char数组，会输出内容。这个和其他的数组不同。
        System.out.println(cs);
    }
}





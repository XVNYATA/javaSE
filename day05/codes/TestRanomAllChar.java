//导入Random
import java.util.Random;

public class TestRanomAllChar
{
    public static void main(String[] args)
    {
        //生成 A-Z、a-z、0-9等所有范围的字符
        // 一、创建一个数组，把所有的字符保存的数组里面
        char[] data = new char[ 62 ];
        for( int i = 0 ;i < 26; i++ )
        {
            //0~25之间，存储A-Z
            data[i] = (char)('A' + i);
            //26~51之间存储，a-z
            data[i + 26] = (char)('a' + i);
            //剩下的52~61之间存储0-9
            if( i < 10 )
            {
                data[ i + 52 ] = (char)('0' + i);
            }
        }

        System.out.print("原始数组: ");
        System.out.println( data );
        // 二、生成的随机数，不需要强制转换为char，而是作为索引从前面的数组里面获取一个字符


        //创建Random的实例
        Random r = new Random();

        //1.为了判断后面生成的字符，是否在前面已经生成过，必须把所有生成的字符保存起来
        char[] cs = new char[ 6 ];

        //生成A-Z之间的任意6个字符
        for( int i = 0; i < cs.length;  )
        {
            //每次循环只需要生成 0 ~ 61 之间的随机数即可
            int t = r.nextInt( 62 );

            //char c = (char) ('A' + t);
            char c = data[ t ];

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





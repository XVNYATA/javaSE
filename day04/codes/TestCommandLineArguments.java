//测试命令行参数
public class TestCommandLineArguments
{
    // 执行命令的时候，如果输入   java TestCommandLineArguments  那么输出的“参数的数量 0”，没有其他的信息输出
    // 如果输入  java TestCommandLineArguments c:/a.txt d:/a.txt  那么输出“参数的数量 2”，并且两个参数会依次输出 
    // 在类名后面，可以使用空格隔开多个参数
    public static void main(String[] args)
    {
        System.out.println( "参数的数量 " + args.length );

        for( String a : args )
        {
            System.out.println( a );
        }
    }
}

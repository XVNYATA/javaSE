class TestEmptyTrangle
{
    public static void main(String[] args)
    {
/*
        1.循环 “总行数” 次
        2.在循环里面，先循环输出空格
        3.继续在循环里面，循环输出星号
        4.空格和星号都输出以后，换行
*/

        //1.
        int rows = 6;
        for( int rowNumber = 1; rowNumber <= rows; rowNumber++ )
        {
            //2.每行的空格数 = 总行数 - 行号
            for( int blankNumber = 1; blankNumber <= rows - rowNumber; blankNumber ++ )
            {
                System.out.print(" ");
            }

            //3.输出星号，行号 * 2 - 1
            //是否第一行或者最后一行。如果是则直接输出星号。否则输出空格，并且在空格前后加上星号。
            //中间的空格数量，是星号数量 - 2，因为前后有星号。

            if( rowNumber == 1 || rowNumber == rows )
            {
                for( int starNumber = 1; starNumber <= rowNumber * 2 - 1; starNumber++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for( int starNumber = 1; starNumber <= rowNumber * 2 - 1 - 2; starNumber++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            //4.换行
            System.out.println();
        }
    }
}

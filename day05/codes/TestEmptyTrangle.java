class TestEmptyTrangle
{
    public static void main(String[] args)
    {
/*
        1.ѭ�� ���������� ��
        2.��ѭ�����棬��ѭ������ո�
        3.������ѭ�����棬ѭ������Ǻ�
        4.�ո���ǺŶ�����Ժ󣬻���
*/

        //1.
        int rows = 6;
        for( int rowNumber = 1; rowNumber <= rows; rowNumber++ )
        {
            //2.ÿ�еĿո��� = ������ - �к�
            for( int blankNumber = 1; blankNumber <= rows - rowNumber; blankNumber ++ )
            {
                System.out.print(" ");
            }

            //3.����Ǻţ��к� * 2 - 1
            //�Ƿ��һ�л������һ�С��������ֱ������Ǻš���������ո񣬲����ڿո�ǰ������Ǻš�
            //�м�Ŀո����������Ǻ����� - 2����Ϊǰ�����Ǻš�

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

            //4.����
            System.out.println();
        }
    }
}

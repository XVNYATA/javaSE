public class TestForEach
{
    public static void main(String[] args)
    {
        int[] a1 = new int[]{ 1,2,3,4,5 };

        for( int i = 0; i < a1.length; i++)
        {
            int t = a1[i];
            System.out.print( t );
            System.out.print(",");
        }
        System.out.println();

        for( int t : a1 )
        {
            System.out.print( t ); 
            System.out.print( "," ); 
        }
        System.out.println();


        double[] ds = new double[]{1,2,3,4,5};

        for( double d : ds )
        {
            System.out.println( d );
        }
    }
}

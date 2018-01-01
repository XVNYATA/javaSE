//1.
import java.util.Random;

public class TestRandomChar
{
    public static void main(String[] args)
    {
        //2.
        Random r = new Random();

        //3.Ñ­»·ËÄ´Î
        for( int i = 0; i < 4; i++ )
        {
            // t >= 0 && t < 26
            int t = r.nextInt( 26 );

            char c = (char) ( t + 'A' );
            System.out.print( c );
        }
        System.out.println();
    }
}

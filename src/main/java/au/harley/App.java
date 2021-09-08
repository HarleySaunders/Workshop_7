package au.harley;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(isDivisableByFive(50));
    }

    public static boolean isDivisableByFive(int number)
    {
        return number % 5 == 0;
    }
}

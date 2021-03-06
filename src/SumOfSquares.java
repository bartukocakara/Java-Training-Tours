public class SumOfSquares
{
    public static void main(String[] args) {

        int n = 0;
        int sumsq = 0;

        while (sumsq < 100)
        {
            n++;
            sumsq = sumsq + (n * n);
            System.out.println(n + " " + sumsq);
        }

        System.out.printf("The sum of squares up to %d is %d .\n", n, sumsq);
    }
}

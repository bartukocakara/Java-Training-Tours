public class SalesReport {

    public static void main(String[] args) {
        double[][] sales = {
                {10, 20, 30},
                {14, 22, 31, 120, 93, 232},
                {17, 28, 35, 90},
        };

        System.out.println("Length of sales is " + sales.length);
        System.out.println("Length of sales of 1st is " + sales[0].length);
        System.out.println("Length of sales of 2nd is " + sales[1].length);

        double grandTotal = 0.0;
        for(int row = 0; row < sales.length; row++){
            for(int col = 0; col < sales[row].length; col++) {
                grandTotal = grandTotal + sales[row][col];
            }
        }
        System.out.printf("The grand total is $%.2f\n", grandTotal);

        final int BASE_YEAR = 2016;
        for(int row = 0; row < sales.length; row++) {
            double yearlyTotal = 0.0;
            for(int  col = 0; col < sales[row].length; col++) {
                yearlyTotal += sales[row][col];
            }
            System.out.printf("Total for %d is $%.2f\n",BASE_YEAR + row, yearlyTotal);
        }
        for(int col = 0; col < sales[0].length;  col++){
            double quarterlyTotal = 0.0;
            for(int row = 0; row < sales.length; row++) {
                quarterlyTotal += sales[row][col];
            }
            System.out.printf("Total for Q%d is $%.2f\n", col + 1, quarterlyTotal);
        }
    }
}

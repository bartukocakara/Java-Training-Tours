public class VarArgs {

    public static int max(int... numbers){
        int maximum = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        System.out.println(max(3, 4));
        System.out.println(max(7, 23, 21));
        System.out.println(max(5, 10));
        int[] data = {3, 18, 2, 5, 12};
        System.out.println(max(123, 232));
    }
}

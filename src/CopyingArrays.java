public class CopyingArrays
{
    public static void main(String[] args) {
        int[] arrayA = {100, 101, 102};
        int[] arrayB = arrayA;

        arrayB[1] = 999;
        System.out.println(arrayA[1]);

        int[] arrayC = new int[arrayA.length];
        System.arraycopy(arrayA, 0, arrayC, 0, arrayA.length);
        arrayC[2] = 777;
        System.out.println("ArrayA[2]: " + arrayA[2]);
        System.out.println("ArrayC[2]: " + arrayC[1]);
    }
}

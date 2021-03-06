public class UseUtils {
    public static int max(int[] data) throws IllegalArgumentException {
        if(data.length > 0) {
            int maxVal = data[0];
            for (int item: data) {
                if (item > maxVal) {
                    maxVal = item;
                }
            }
            return (maxVal);
        }else {
            throw new IllegalArgumentException("Array length must be greater than zero ");
        }
    }
}

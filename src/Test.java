public class Test {

    public static void main(String[] args) {
        int numberToFind = 2;

        int[] array = {2,2,5,1,2,4,1};

        int[] resultArrayTemp = new int[array.length];
        int resultArrayIndex = 0;
        for (int i : array) {
            if (i == numberToFind) {
                continue;
            }
            resultArrayTemp[resultArrayIndex] = i;
            resultArrayIndex++;
        }

        for (int i : resultArrayTemp) {
            System.out.print(i + ",");
        }
        System.out.println();
        int[] resultArray = new int[array.length  - (array.length - resultArrayIndex)];
        if (resultArray.length >= 0) System.arraycopy(resultArrayTemp, 0, resultArray, 0, resultArray.length);
        for (int i : resultArray) {
            System.out.print(i + ",");
        }
    }
}

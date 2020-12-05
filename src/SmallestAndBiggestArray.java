import java.util.Arrays;

public class SmallestAndBiggestArray {

    int maxSum;
    int minSum;
    public void calculateSmallestSum(int[] array){
        int sum = 0;
        int min = array[0];

        for (int checker = 0; checker < array.length; checker++){
            sum += array[checker];


            if (min > array[checker]){
                min = array[checker];
            }
            int minNum = Arrays.stream(array).max().getAsInt();

            maxSum = sum - min;
        }
    }
    public int getMaxSum(){

        return maxSum;
    }

    public void calculateLargestNumber(int[] newArray){
        int sum2 = 0;
        int max = newArray[0];

        for (int checker = 0; checker < newArray.length; checker++) {
            sum2 += newArray[checker];


            if (max < newArray[checker]) {
                max = newArray[checker];

            }
            minSum = sum2 - max;


        }
    }

    public int getMinSum(){
        return minSum;
    }
}

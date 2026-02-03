package array;

public class SumOfArray {
    public static void main(String[] args){
        int[] arr = {2,3,2,5,6,9,8};
        int arraySum = Sum(arr);
        System.out.println("The sum of array is " + arraySum);

        int AverageOfArray = arraySum/arr.length;
        System.out.println("The average of array is " + AverageOfArray);
    }
    public static int Sum(int[] arr){
        int result = 0;
        int i = 0;
        while (i<arr.length){
            result = result + arr[i];
            i++;
        }
        return result;
    }
}

package array;

public class MinMax {
    public static void main(String[] args){
        int[] arr = {22,45,46,48,35,65,95,86,78,84,96,86,23,25,64,2,28,27,36};

        int minNumber = Min(arr);
        System.out.println("Minimum number of array: " + minNumber);
        int maxNumber = Max(arr);
        System.out.println("Maximum number of array: "+ maxNumber);
    }
    public static int Max(int[] arr){
        int i = 0;
        int max_num = 0;
        while(i<arr.length){
            if (arr[i]>max_num){
                max_num = arr[i];
            }
            i++;
        }
        return max_num;
    }
    public static int Min(int[] arr){
        int i = 0;
        int min_num = arr[0];
        while(i<arr.length){
            if(arr[i]<min_num){
                min_num=arr[i];
            }
            i++;
        }
        return min_num;
    }
}

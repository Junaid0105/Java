package array;

public class IsSortedOrNot {
    public static void main(String[] args){
        int[] arr = ArrayUtility.inputArray();// used my own method to take input by user
        boolean SortedOrNot = IsSort(arr);
        if (SortedOrNot){
            System.out.println("Sorted");
        }
        else {
            System.out.println("Unsorted");
        }
    }
    public static boolean IsSort(int[] arr){
        int i = 0;
        while(i<(arr.length-1)){
            if(arr[i]>arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}

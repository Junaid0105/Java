package array;

public class TwoD_Array {
    public static void main(String[] args){
        int[][] numArr = new int[2][2];
        numArr[0][0] = 1;
        numArr[0][1] = 2;
        numArr[1][0] = 3;
        numArr[1][1] = 4;
        int i = 0;
        while(i<numArr.length){
            int j = 0;
            while (j<numArr[i].length){
                System.out.println(numArr[i][j]);
                j++;
            }
            i++;
        }
    }
}

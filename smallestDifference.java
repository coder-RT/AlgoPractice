import java.util.Arrays;

public class smallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo){
        // Sort the two input arrays
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int idxOne = 0;
        int idxTwo = 0;
        int smallest = Integer.MAX_VALUE;
        int difference = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];

        while(idxOne < arrayOne.length && idxTwo < arrayTwo.length){
            int firstNum = arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];
            if(firstNum < secondNum){
                difference = secondNum - firstNum;
                idxOne++;
            }
            else if(firstNum > secondNum){
                difference = firstNum - secondNum;
                idxTwo++;
            }
            else{
                return new int[] {firstNum,secondNum};
            }
            if(smallest > difference){
                smallest = difference;
                smallestPair = new int[] {firstNum, secondNum};
            }
        }
        return smallestPair;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(smallestDifference(new int[] {-1,5,10,20,28,3}, new int[] {26,134,135,15,17})));
    }
}

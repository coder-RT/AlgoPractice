import java.util.Arrays;

public class smallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo){
        // Sort the two input arrays
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int idxOne = 0;
        int idxTwo = 0;
        int[] smallestPair = new int[2];
        while(idxOne < arrayOne.length && idxTwo < arrayTwo.length){
            if(arrayOne[idxOne] < arrayTwo[idxTwo]){

            }
            else if(arrayOne[idxOne] > arrayTwo[idxTwo]){

            }
            else{
                return new int[] {arrayOne[idxOne],arrayTwo[idxTwo]};
            }
        }
        return smallestPair;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(smallestDifference(new int[] {-1,5,10,20,28,3}, new int[] {26,134,135,15,17})));
    }
}

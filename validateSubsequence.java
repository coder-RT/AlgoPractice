public class validateSubsequence {
    public static boolean validateSubsequence(int[] array, int[] subsequence){

        int arrayIDX = 0;
        int subIDX = 0;

        while(arrayIDX < array.length){
            if(array[arrayIDX] == subsequence[subIDX]){
                subIDX++;
            }
            arrayIDX++;
        }

        return subIDX==subsequence.length;
    }
    public static void main(String[] args){
        System.out.println(validateSubsequence(new int[] {5,1,22,25,6,-1,8,10}, new int[] {1,6,-1,10}));
    }
}

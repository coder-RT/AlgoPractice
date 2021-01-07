public class maxMinDifference {
    public static int solve(int[] A){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int i=0; i<A.length; i++){
            if(A[i] %2 == 0 && max < A[i]){
                max = A[i];
            }
            if(A[i] %2 != 0 && min > A[i]){
                min = A[i];
            }
        }
        res = max - min;
        return (res != 0) ? res : 0;
    }
    public static void main(String[] args){
        //int res = solve(new int[] {0,2,9});
        int res = solve(new int[] {-15, -45, 43, 23, -63, 69, 35, 19, 37, -52});
        System.out.println(res);
    }
}

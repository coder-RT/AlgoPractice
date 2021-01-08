public class singleNumber {
    public static int singleNum(int[] a){
        int res = 0;
        for(int i=0; i< a.length; i++){
            res = res ^ a[i];
        }
        return res;
    }
    public static void main(String[] args){
        int res = singleNum(new int[] {1,1,2,3,4,4});
        System.out.println(res);
    }
}

public class numberOfSetBits {
    public static int returnSetBits(long a){
        int bits = 32;
        int sum = 0;
        while(bits > 0){
            long rem = a & 1; // remainder
            if(rem == 1){
                sum += 1;
            }
            a = a >> 1;
            bits--;
        }
        return sum;
    }
    public static void main(String[] args){
        long res = returnSetBits(11);
        System.out.println(res);
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class reverseBits {
    public static long reverse(long A){
        int bits = 32;
        long result = 0;
        long[] lst = new long[bits];

        int index = 0;
        while(bits > 0){
            lst[index] = A & 1;
            A = A >> 1;
            index++;
            bits--;
        }

        for(int i=0; i< lst.length; i++){
            result = result << 1;
            result = result | lst[i];
        }
        return result;
    }
    public static void main(String[] args){
        long res = reverse(3);
        System.out.println(res);
    }
}

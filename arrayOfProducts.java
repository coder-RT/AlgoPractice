import java.util.Arrays;

public class arrayOfProducts {
    public static int[] arrayOfProducts(int[] array){
        int[] leftProductArray = new int[array.length];
        int leftProduct = 1;

        int[] rightProductArray = new int[array.length];
        int rightProduct = 1;

        int[] productArray = new int[array.length];

        for(int i=0; i<array.length;i++){
            leftProductArray[i] = leftProduct;
            leftProduct *= array[i];
        }

        for(int i=array.length-1; i>=0; i--){
            rightProductArray[i] = rightProduct;
            rightProduct *= array[i];
        }

        for(int i=0; i<array.length; i++){
            productArray[i] = leftProductArray[i] * rightProductArray[i];
        }
        return productArray;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(arrayOfProducts(new int[] {5,1,4,2})));
    }
}

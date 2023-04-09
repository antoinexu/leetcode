import java.util.Arrays;

public class LC66 {

    public int[] plusOne(int[] digits) {

        for(int i = digits.length-1; i>=0 ; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] temp = new int[digits.length+1];
        temp[0] = 1;
        return temp;
    }

    public static void main(String[] args) {

        LC66 lc66 = new LC66();
        int[] digits = {1,2,3};
        int[] result = lc66.plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}

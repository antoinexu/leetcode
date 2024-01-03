import java.util.Locale;

public class LC125 {

    public boolean isPalindrome(String s) {
        if(s == null){
            return false;
        }

        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}

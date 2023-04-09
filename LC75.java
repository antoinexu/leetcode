import java.util.Arrays;
public class LC75 {

    public void sortColors(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int target = 0;
        while(target <= right){
            if(nums[target] == 0){
                swap(nums, target, left);
                left++;
                target++;
            }else if(nums[target] == 2){
                swap(nums, target, right);
                right--;
            }else{
                target++;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        LC75 lc75 = new LC75();
        int[] nums = {2,0,2,1,1,0};
        System.out.println("Before sorting: " + Arrays.toString(nums));
        lc75.sortColors(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
    }
}

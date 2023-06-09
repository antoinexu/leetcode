import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class LC1 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        LC1 lc1 = new LC1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = lc1.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

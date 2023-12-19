package leetcode.TwoSum;

/*Input: nums = [2,7,11,15], target = 9
  Output: [0,1]
  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 7, 4, 5, 6, 7}, 13)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

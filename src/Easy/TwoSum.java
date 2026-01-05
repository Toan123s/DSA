package Easy;

import java.util.HashMap;
import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> need = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (need.get(number) != null) {
                return new int[] { need.get(number), i };
            }
            need.put(nums[i], i);
        }
        return null;
    }

    // Thêm main method để test
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(result));
        System.out.println("Expected: [0, 1]");
    }
}
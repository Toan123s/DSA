package Easy;

public class Maximum_product_difference_between_two_pairs {
    public static void main(String[] args) {

    }

    public int maxProductDifference(int[] nums) {
        int Max1 = (nums[0] > nums[1]) ? nums[0] : nums[1];
        int Max2 = (nums[0] < nums[1]) ? nums[0] : nums[1];

        int min1 = (nums[0] < nums[1]) ? nums[0] : nums[1];
        int min2 = (nums[0] > nums[1]) ? nums[0] : nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > Max1) {
                Max2 = Max1;
                Max1 = nums[i];
            } else {
                if (nums[i] > Max2) {
                    Max2 = nums[i];
                }
            }

            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else {
                if (nums[i] < min2) {
                    min2 = nums[i];
                }
            }
        }
        return (Max1 * Max2) - (min1 * min2);
    }
}

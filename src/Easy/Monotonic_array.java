package Easy;

public class Monotonic_array {

    public boolean isMonotonic(int[] nums) {
        int i = 0, j = 0;
        while(i < nums.length - 1 && nums[i] >= nums[i + 1]){
            i++;
        }

        while(j < nums.length - 1 && nums[j] <= nums[j + 1]){
            j++;
        }

        return i == nums.length - 1 || j == nums.length - 1;
    }
}

package Easy;

import java.util.Arrays;

public class Divide_array_into_equal_pairs {
    public static void main(String[] args) {

    }

    public boolean divideArray(int[] nums) {
        int demCap = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i+=2){
            if(nums[i] == nums[i + 1]){
                demCap++;
            }
        }
        return nums.length == 2 * demCap;
    }
}

package Easy;

public class Trionic_Array_I {
    public static void main(String[] args) {

    }

    public boolean isTrionic(int[] nums) {
        int l = 0, r = nums.length - 1;
        for(int i = l; i < r; i++){
            if(nums[i] >= nums[i + 1]){
                break;
            }
            l++;
        }
        for(int i = r; i > 0; i--){
            if(nums[i] <= nums[i - 1]){
                break;
            }
            r--;
        }
        if(l >= r || l == 0 || r == nums.length - 1){
            return false;
        }
        for(int i = l; i < r; i++){
            if(nums[i] <= nums[i + 1]){
                return false;
            }
        }
        return true;
    }
}

package Easy;

public class Largest_unique_number {

    public int largestUniqueNumber(int[] nums) {
        int[] tuanSuat = new int[1001];
        for(int i = 0; i < nums.length; i++){
            tuanSuat[nums[i]]++;
        }
        for(int i = tuanSuat.length - 1; i >= 0; i--){
            if(tuanSuat[i] == 1){
                return i;
            }
        }
        return -1;
    }
}

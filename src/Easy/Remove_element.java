package Easy;

public class Remove_element {

    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1;
        while(l <= r){
            if(nums[l] != val){
                l++;
            }else{
                if(nums[r] == val){
                    r--;
                }else{
                    int temp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = temp;
                    l++;
                    r--;
                }
            }
        }
        return r + 1;
    }
}

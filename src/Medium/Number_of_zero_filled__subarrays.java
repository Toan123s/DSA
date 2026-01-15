package Medium;

public class Number_of_zero_filled__subarrays {

    public static void main(String[] args) {

    }

    public static long zeroFilledSubarray(int[] nums) {
        long dem = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
                count++;
                dem += count;
            }
            else{
                count = 0;
            }
        }
        return dem;
    }
}

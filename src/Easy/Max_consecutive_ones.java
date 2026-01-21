package Easy;

public class Max_consecutive_ones {
    public static void main(String[] args) {

    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int dem = 0, demMax = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                dem++;
            }else{
                if(dem > demMax){
                    demMax = dem;
                }
                dem = 0;
            }

        }

        if(dem > demMax){
            demMax = dem;
        }
        return demMax;
    }
}

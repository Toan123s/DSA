package Medium;

public class Sort_colors {
    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {

        // bubble sort tối ưu, runtime: 2ms, memory: 43.81ms
        // boolean coThayDoi = true;
        // for(int i = 0; i < nums.length; i++){
        //     if(coThayDoi){
        //         coThayDoi =false;
        //         for(int j = 0; j < nums.length - 1; j++){
        //             if(nums[j ] > nums[j + 1]){
        //                 int temp = nums[j];
        //                 nums[j] = nums[j + 1];
        //                 nums[j + 1] = temp;
        //                 coThayDoi = true;
        //             }
        //         }
        //     }else{
        //         break;
        //     }

        // }

        // xếp theo giá trị
        int[] mau = new int[3];
        for(int i = 0; i < 3; i++){
            mau[i] = 0;
        }

        for(int i = 0; i < nums.length; i++){
            mau[nums[i]]++;
        }

        int k = 0;
        for(int i = 0; i < mau.length; i++){
            for(int j = 0; j < mau[i]; j++){
                nums[k] = i;
                k++;
            }
        }

    }
}

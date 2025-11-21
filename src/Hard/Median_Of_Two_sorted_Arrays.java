package Hard;

public class Median_Of_Two_sorted_Arrays {
    public static void main(String[] args) {
        int nums1[] = {1, 3}, nums2[] = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int k = 0, j = 0, i = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                nums[k] = nums2[j];
                j++;
            }
            else{
                nums[k] = nums1[i];
                i++;
            }
            k++;
        }
        while(i < nums1.length){
            nums[k] = nums1[i];
            i++;
            k++;
        }

        while(j < nums2.length){
            nums[k] = nums2[j];
            j++;
            k++;
        }
        if(k % 2 == 0){
            return 1.0*(nums[k/2] + nums[k/2 - 1]) / 2;
        }
        return 1.0*nums[k/2];
    }
}

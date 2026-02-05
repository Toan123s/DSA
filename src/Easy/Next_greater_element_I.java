package Easy;

import java.util.HashMap;
import java.util.Map;

public class Next_greater_element_I {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] kq = new int[nums1.length];
        Map<Integer, Integer> flag = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            flag.put(nums2[i], i);
        }
        for(int i = 0; i < nums1.length; i++){
            if(flag.containsKey(nums1[i]) && flag.get(nums1[i]) < nums2.length - 1){
                int j = flag.get(nums1[i]) + 1;
                while(j < nums2.length && nums2[j] <= nums1[i]){
                    j++;
                }
                if(j == nums2.length){
                    kq[i] = -1;
                }else{
                    kq[i] = nums2[j];
                }
            }else{
                kq[i] = -1;
            }
        }
        return kq;

    }
}

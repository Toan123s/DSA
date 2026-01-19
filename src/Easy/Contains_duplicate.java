package Easy;

import java.util.HashSet;

public class Contains_duplicate {

    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

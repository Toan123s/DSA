package Easy;

import java.util.Arrays;

public class Height_checker {
    public static void main(String[] args) {

    }

    public int heightChecker(int[] heights) {
        int[] arrCopy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arrCopy);
        int dem = 0;
        for(int i = 0; i < heights.length; i++){
            if(arrCopy[i] != heights[i]){
                dem++;
            }
        }
        return dem;
    }
}

package Easy;

import java.util.ArrayList;
import java.util.List;

public class Pascals_triangle {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> gener = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    l.add(1);
                }else{
                    int num = gener.get(i - 1).get(j - 1) + gener.get(i - 1).get(j);
                    l.add(j, num);
                }
            }
            gener.add(l);
        }
        return gener;

    }
}

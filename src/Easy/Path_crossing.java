package Easy;

import java.util.HashMap;
import java.util.HashSet;

public class Path_crossing {

    public boolean isPathCrossing(String path) {
        HashMap<Character, Pair<Integer, Integer>> coordinates  = new HashMap<>();
        coordinates.put('N', new Pair(0,1));
        coordinates.put('S', new Pair(0,-1));
        coordinates.put('W', new Pair(-1,0));
        coordinates.put('E', new Pair(1,0));
        int x = 0, y = 0;
        Set<Pair<Integer, Integer>> visited = new HashSet<>();
        visited.add(new Pair(x,y));
        for(char c : path.toCharArray()){
            Pair<Integer, Integer> t = coordinates.get(c);
            int dx = t.getKey();
            int dy = t.getValue();
            x += dx;
            y += dy;
            Pair<Integer, Integer> r = new Pair<>(x, y);
            if(visited.contains(r)){
                return true;
            }
            visited.add(r);
        }
        return false;

    }
}

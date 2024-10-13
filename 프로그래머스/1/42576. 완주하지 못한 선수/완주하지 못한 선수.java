import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String x : participant) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (String x : completion) {
            map.put(x, map.get(x) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) return key;
        }

        return "";
    }
}
import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        for (int i = 0; i < sizes.length; i++) Arrays.sort(sizes[i]);
        
        for (int i = 0; i < sizes.length; i++) {
            if (height < sizes[i][0]) height = sizes[i][0];
            if (width < sizes[i][1]) width = sizes[i][1];
        }
        
        return width * height;
    }
}
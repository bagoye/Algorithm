class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");

        int max = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[0]);

        for (String x : str) {
            int temp = Integer.parseInt(x);

            if (min > temp) min = temp;

            if (max < temp) max = temp;
        }

        return min + " " + max;
    }
}
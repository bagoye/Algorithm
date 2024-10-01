class Solution {
    public long solution(int price, int money, int count) {
		long total = 0;
		
		while (count > 0)
		{
			total += (long) price * count;
			count--;
		}
		
		return Math.max(total - money, 0);
    }
}
class Solution {
  public long solution(long n) {
      long num = (long) Math.sqrt(n);
	      
	    if(Math.pow(num, 2) == n) {
            return (long) Math.pow(num + 1, 2);
        }
	    return -1;
  }
}
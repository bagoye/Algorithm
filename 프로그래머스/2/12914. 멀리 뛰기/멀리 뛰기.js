function solution(n) {
    const dp = new Array(n+1).fill(0);
    dp[0] = 1;
    dp[1] = 1;
    for (let i = 2; i <= n; i++){
        dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
    }
    return dp[n];
}

// 1칸 뛰어야 할 때 : 1가지
// 2칸 뛰어야 할 때 : 2가지 (11 / 2)
// 3칸 뛰어야 할 때 : 3가지 (111/ 12/ 21)
// 4칸 : 5가지 (1111/ 112/ 121/ 211/ 22)
// dp[i] = dp[i-2] + dp[i-1]
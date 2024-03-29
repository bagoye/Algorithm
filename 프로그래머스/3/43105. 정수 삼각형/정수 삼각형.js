function solution(triangle) {
    const dp = Array.from(Array(triangle.length), () => new Array(triangle.length).fill(0));
    dp[0][0] = triangle[0][0]
    
    for (let i = 1; i < triangle.length; i++) {
        for (let j = 0; j <= i; j++) {
            if (j - 1 >= 0) {
                dp[i][j] = dp[i-1][j-1] + triangle[i][j]
            }
            if (dp[i-1][j]) {
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j] + triangle[i][j])
            }
        }
    }
    return Math.max(...dp[triangle.length-1])
}
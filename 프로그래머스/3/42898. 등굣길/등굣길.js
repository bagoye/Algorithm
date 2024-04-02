function solution(m, n, puddles) {
    let dp = Array.from(Array(n + 1), () => Array(m + 1).fill(0));
    dp[1][1] = 1;
    const puddlesSet = new Set(puddles.map(puddle => `${puddle[0]},${puddle[1]}`));

    for (let i = 1; i <= n; i++) {
        for (let j = 1; j <= m; j++) {
            if (i == 1 && j == 1) continue;
            if (puddlesSet.has(`${j},${i}`)) {
                dp[i][j] = 0;
            } else {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
            }
        }
    }

    return dp[n][m];
}

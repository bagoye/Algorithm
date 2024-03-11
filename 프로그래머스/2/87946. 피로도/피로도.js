function solution(k, dungeons) {
    var answer = -1;
    let visited = Array(dungeons.length).fill(false);
    
    function dfs(k, cnt) {
        for (let i = 0; i < dungeons.length; i++) {
            if (k >= dungeons[i][0] && !visited[i]) {
                visited[i] = true;
                dfs(k - dungeons[i][1], cnt + 1);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, cnt)
    }
    
    dfs(k, 0)
    return answer;
}
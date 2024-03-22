function solution(n, computers) {
    var answer = 0;
    const visited = new Array(n).fill(0);
    const q = [];
    
    for (let i = 0; i < n; i++){
        if (visited[i]) continue;
        
        answer++;
        visited[i] = 1;
        q.push(i);
        
        while (q.length > 0) {
            const v = q.shift();
            for (let idx = 0; idx < n; idx++) {
                if (computers[v][idx] && !visited[idx]){
                    visited[idx] = 1
                    q.push(idx)    
                }
            }
        }
    }
    return answer;
}
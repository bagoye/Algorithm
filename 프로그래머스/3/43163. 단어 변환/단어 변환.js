function solution(begin, target, words) {
    var answer = 0;
    let visited = new Array(words.length).fill(false)
    
    function dfs(word, target, cnt) {
        if (word === target) {
            if (answer === 0 || answer > cnt){
                answer = cnt
            }
            return
        }
        
        for (let i = 0; i < words.length; i++) {
            if(visited[i]) continue;
            let diffCnt = 0;
            
            for (let j = 0; j < words[i].length; j++) {
                if (words[i][j] !== word[j]) {
                    diffCnt += 1
                }
            }
            
            if (diffCnt === 1) {
                visited[i] = true;
                dfs(words[i], target, cnt + 1);
                visited[i] = false
            }
        }
    }
    dfs(begin, target, 0)
    return answer;
}
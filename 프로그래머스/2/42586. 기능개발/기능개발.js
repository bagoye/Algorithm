function solution(progresses, speeds) {
    var answer = [];
    let idx = 0;
    
    while (idx < progresses.length) {
        let cnt = 0;
        
        for (let i = 0; i < progresses.length; i++) {
            progresses[i] += speeds[i];
        }
        
        while (idx < progresses.length && progresses[idx] >= 100) {
            cnt++;
            idx++;
        }
        
        if (cnt > 0) {
            answer.push(cnt);
        }
    }
    
    return answer;
}

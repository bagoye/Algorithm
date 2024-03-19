function solution(k, m, score) {
    var answer = 0;
    score.sort((a, b) => b - a);
    score.forEach((el, idx) => {
        if (idx % m === 0 && score[idx+m-1]) {
            answer += score[idx+m-1]*m;
        }
    })
    return answer;
}
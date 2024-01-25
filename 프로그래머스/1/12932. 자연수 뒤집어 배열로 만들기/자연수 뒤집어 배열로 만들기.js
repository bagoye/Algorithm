function solution(n) {
    var str = n.toString().split('');
    var answer = [];
    for (let i = str.length - 1; i >= 0; i--) {
        answer.push(Number(str[i]))
    }
    return answer;
}
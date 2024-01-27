function solution(n) {
    var arr = (n+"").split('');
    arr.sort((a, b) => b - a)
    var answer = Number(arr.toString().replace(/\,/g,''));
    return answer;
}
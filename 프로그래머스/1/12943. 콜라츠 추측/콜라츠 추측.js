function solution(num) {
    let answer = 0;
    let i = 0;

    while (i < 500) {
        if (num !== 1) {
            num = num % 2 === 0 ? num / 2 : num * 3 + 1;
        } else {
            answer = i;
            return answer;
        }
        i++;
    }

    answer = -1;
    return answer;
}

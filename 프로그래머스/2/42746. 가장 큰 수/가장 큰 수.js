function solution(numbers) {
    var answer = numbers.map((num) => String(num)).sort((a, b) => (b + a) - (a + b)).join("");
    return answer[0] === "0" ? "0" : answer;
}
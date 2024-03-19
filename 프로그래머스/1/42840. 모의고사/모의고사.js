function solution(answers) {
    var answer = [];
    let p1 = [1, 2, 3, 4, 5]
    let p2 = [2, 1, 2, 3, 2, 4, 2, 5]
    let p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    let cnt1 = answers.filter((p, i) => p === p1[i % p1.length]).length;
    let cnt2 = answers.filter((p, i) => p === p2[i % p2.length]).length;
    let cnt3 = answers.filter((p, i) => p === p3[i % p3.length]).length;
    
    let max = Math.max(cnt1, cnt2, cnt3)
    
    if (cnt1 === max) {answer.push(1)};
    if (cnt2 === max) {answer.push(2)};
    if (cnt3 === max) {answer.push(3)};
    
    return answer;
}
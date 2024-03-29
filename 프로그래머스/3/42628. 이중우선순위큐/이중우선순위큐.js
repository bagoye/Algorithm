function solution(operations) {
    var answer = [];
    for (let i = 0; i < operations.length; i++) {
        if (operations[i][0] === "I") {
            answer.push(parseInt(operations[i].substring(2)))
        } else if (answer.length > 0) {
            if (operations[i] === "D 1") {
                let maxVal = Math.max(...answer)
                answer = answer.filter(item => item !== maxVal)
            } else if (operations[i] === "D -1") {
                let minVal = Math.min(...answer)
                answer = answer.filter(item => item !== minVal)
            }
        }
    }
    if (answer.length === 0) {
    return [0, 0]
    }
    return [Math.max(...answer), Math.min(...answer)];
}
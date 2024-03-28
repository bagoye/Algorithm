function solution(begin, target, words) {
    var answer = 0;
    if (!words.includes(target)) return 0
    const visited = new Array(words.length).fill(false)
    const q = []
    q.push({ word: begin, depth: 0})
    
    while (q.length) {
        const {word, depth} = q.shift()
        if (word === target) return depth
        words.forEach((w, idx) => {
            if (!visited[idx] && verify(word, w)) {
                q.push({word: w, depth:depth+1})
                visited[idx] = 1 
                }
        })
    }
    
    
    return answer;
}
    
function verify(word, w) {
    let diffCnt = 0
    for (let i = 0; i < word.length; i++) {
        if (word[i] !== w[i]) diffCnt++
    }
    return diffCnt === 1 ? true : false
}
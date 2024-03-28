function solution(word) {
    let vowel = ['A', 'E', 'I', 'O', 'U'];
    var answer = 0;
    
    for (let i = 0; i < word.length; i++) {
        const idx = vowel.indexOf(word[i])
        for (let j = 0; j < 5-i; j++) {
            answer += idx * Math.pow(5, j)
        }
    }
    
    return answer + word.length
    
}
function solution(s){
    s = s.toLowerCase()
    let p = 0
    let y = 0
    for (i = 0; i <= s.length; i++)
        if (s[i] === 'p') {
            p += 1
        } else if (s[i] === 'y') {
            y += 1
        }
    
    if (p === y) {
        return true
    } else {
        return false
    }
}
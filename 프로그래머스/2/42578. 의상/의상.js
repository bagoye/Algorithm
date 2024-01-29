function solution(clothes) {
    var answer = 1;
    let a = {};
    for (let i = 0; i < clothes.length; i++) {
        let type = clothes[i][1];
        if (clothes[i][1] in a) {
            a[type]++
        } else {
            a[type] = 1
        }
    }
    
    for (let i in a) {
        answer *= (a[i] + 1)
    }
    
    return answer - 1;
}
function solution(x) {
    var arr = (x+"").split('');
    let sum = 0
    arr.forEach(num => sum += Number(num))
    if (x % sum === 0) {
        return true
    } else {
        return false
    }
}
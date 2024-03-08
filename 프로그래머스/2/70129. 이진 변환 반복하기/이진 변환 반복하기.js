function solution(s) {
    let cnt = 0;
    let remove = 0;
    let length = s.length;
    
    while(length > 1){
        let newStr = '';
        for (let i = 0; i < s.length; i++) {
            if (s[i] === '1') {
                newStr += '1';
            } else {
                remove++;
            }
        }
        cnt++
        s = newStr.length.toString(2);
        length = newStr.length;
    }
    
    return [cnt, remove];
}
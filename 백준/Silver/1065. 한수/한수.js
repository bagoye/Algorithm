let input = require('fs').readFileSync('dev/stdin').toString().trim().split('\n');
let num = Number(input[0]);

function solution(num) {
    let cnt = 0;
    for (let i = 1; i <= num ; i ++) {
        if(i < 100) { 
            cnt ++;
        } else if (i => 100 && i < 1000 ){
            let strNum = String(i);
            let diff1 = Number(strNum[1]) - Number(strNum[0]);
            let diff2 = Number(strNum[2]) - Number(strNum[1]);

            if (diff1 === diff2) {
                cnt ++;
            }
        }
    }
    return cnt;
}

console.log(solution(num));
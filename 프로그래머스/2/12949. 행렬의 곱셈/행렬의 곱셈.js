function solution(arr1, arr2) {
    var answer = [];
    for (let i = 0; i < arr1.length; i++){
        const arr = []
        for (let j = 0; j < arr2[0].length; j++){
            let temp = 0;
            for (let n = 0; n < arr1[i].length; n++) {
                temp += arr1[i][n] * arr2[n][j];
            }
            arr.push(temp);
        }
        answer.push(arr);
    }
    return answer;
}
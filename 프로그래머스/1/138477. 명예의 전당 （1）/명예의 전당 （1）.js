function solution(k, score) {
    var answer = [];
    let singer = new Array(k);
    
    for (let i=0; i<score.length; i++){
        if(i<k){
            singer.push(score[i]);
            singer.sort((a, b) => a-b);
            answer.push(singer[0]);
        } else{
            if(score[i]>singer[0]){
                singer[0] = score[i];
                singer.sort((a, b) => a-b);
            }
            answer.push(singer[0])
        }
    }
    return answer;
}
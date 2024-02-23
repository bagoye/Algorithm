function solution(name, yearning, photo) {
    var answer = [];
    let year = {};
    
    name.map((el,i)=>{
        year[el] = yearning[i];
    })
    
    photo.map((paper, i) => {
        let sum=0;
        paper.map((person)=>{
            if(name.includes(person) == true){
                sum+=year[person];
            }
        })
        answer.push(sum);
    });
    
    return answer;
}
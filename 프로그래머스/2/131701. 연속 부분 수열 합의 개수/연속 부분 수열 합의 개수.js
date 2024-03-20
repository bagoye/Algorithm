function solution(elements) {
    var answer = [];
    const circle = [...elements, ...elements];
    
    circle.forEach((el, idx) => {
        if(idx < elements.length) {
            for (let i = 0; i < circle.length; i++) {
                const arr = circle.slice(i, i+idx+1)
                answer.push(arr.reduce((acc, cal) => acc + cal));
            }
        }
    })
    const set = new Set(answer);
    
    return [...set].length;
}
function solution(n,a,b)
{
    var answer = 0;

    while(true){
        if(Math.ceil(a/2) === Math.ceil(b/2)) {
            answer++;
            break
        }
        a = Math.ceil(a/2);
        b = Math.ceil(b/2);
        answer++;
    }

    return answer;
}
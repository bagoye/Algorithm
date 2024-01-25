function solution(n)
{
    var answer = 0;
    str = n.toString()
    for (let i = 0; i < str.length; i++) {
        answer += Number(str[i])
    }

    return answer;
}
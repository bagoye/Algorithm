function solution(citations) {
  let answer = 0;

  for (let i = 1; i <= citations.length; i++) {
    let result = citations.filter((val) => val >= i);
    if (i <= result.length) {
      answer = i;
    }
  }
  return answer;
}

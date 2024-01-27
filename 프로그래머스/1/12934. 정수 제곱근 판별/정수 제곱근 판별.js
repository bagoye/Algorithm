function solution(n) {
  let answer = 0;
  let sqrtN = Math.sqrt(n);

  if (sqrtN % 1 === 0) {
    answer = Math.pow(sqrtN + 1, 2);
  } else {
    answer = -1;
  }

  return answer;
}
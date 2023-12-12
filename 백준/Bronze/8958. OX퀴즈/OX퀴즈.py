for tc in range(int(input())):
  test = list(input())
  score = 0
  ans = 0
  for i in test:
    if i == 'O':
      score += 1
      ans += score
    else:
      score = 0

  print(ans)
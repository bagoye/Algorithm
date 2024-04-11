k = int(input())
answer = []

divisor = 2
while k > 1:
    while k % divisor == 0:
        answer.append(divisor)
        k //= divisor
    divisor += 1
    if divisor * divisor > k:
        if k > 1:
            answer.append(k)
        break

print(len(answer))
print(*answer)

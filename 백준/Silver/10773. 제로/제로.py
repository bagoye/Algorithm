n = int(input())
S = []
for i in range(n):
    num = int(input())
    if num == 0:
        S.pop()
    else:
        S.append(num)
print(sum(S))
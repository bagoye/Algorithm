N = int(input())
rlt = 0
while N >= 0:
    if N % 5 == 0:
        rlt += (N // 5)
        print(rlt)
        break
    else:
        N -= 3
        rlt += 1
else:
    print(-1)
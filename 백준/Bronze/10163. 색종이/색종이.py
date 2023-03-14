T = int(input())
P = [[0] * 1001 for i in range(1001)]
num = []
num1 = []
lst = []
for i1 in range(1,T+1):
    r,c,r1,c1 = map(int,input().split())
    num.append(r+r1)
    num1.append(c+c1)
    for i in range(r,r+r1):P[i][c:c+c1] = [i1]*c1

for i in range(1,T+1):
    cnt = 0
    for r in range(max(num)+1):
        for c in range(max(num1)+1):
            if P[r][c] == i:cnt += 1
    lst.append(cnt)
for i in lst:print(i)

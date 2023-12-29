import sys
input = sys.stdin.readline

N = int(input())
numlist = []
for _ in range(N):
    numlist.append(int(input()))

numlist.sort(reverse=True)

for i in numlist:
    print(i)
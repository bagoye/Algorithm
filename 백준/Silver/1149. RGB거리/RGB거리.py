import sys
input = sys.stdin.readline

n = int(input())
lst = [0] * n

for i in range(n):
  lst[i] = list(map(int, input().split()))

for i in range(1,n): # 1부터 시작하는 이유는 다음 입력값이 이전 입력값의 최소값을 사용하기때문이다
  lst[i][1]= min(lst[i-1][0],lst[i-1][2]) + lst[i][1]
  lst[i][2]= min(lst[i-1][0],lst[i-1][1]) + lst[i][2]
  lst[i][0]= min(lst[i-1][1],lst[i-1][2]) + lst[i][0]

print(min(lst[n-1][0], lst[n-1][1], lst[n-1][2]))
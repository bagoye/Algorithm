import sys
input = sys.stdin.readline

cnt0 = 0
cnt1 = 0
for _ in range(int(input())):
    n = int(input())
    if n == 1:
        cnt1 += 1
    else:
        cnt0 += 1

if cnt0 > cnt1:
    print("Junhee is not cute!")
else:
    print("Junhee is cute!")

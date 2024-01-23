import sys
input = sys.stdin.readline

n = int(input())
switch = [0] + list(map(int, input().split()))

def change(x):
    global switch
    switch[x] = abs(switch[x]-1)

for _ in range(int(input())):
    gender, num = map(int, input().split())
    i = 1
    if gender == 1:
        while num * i <= n:
            change(num * i)
            i += 1
    elif gender == 2:
        change(num)
        while 1 <= num-i and num+i <= n and switch[num-i] == switch[num+i]:
            change(num-i)
            change(num+i)
            i += 1

for i in range(1, n+1):
    print(switch[i], end=" ")
    if not i % 20:
        print()

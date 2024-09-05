import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    answer = 0
    
    for i in range(1, int(n ** 0.5) + 1):
        answer += 1

    print(answer)
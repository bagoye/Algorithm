import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    rank = sorted([list(map(int, input().split())) for _ in range(n)])
    top = 0
    result = 1
    
    for i in range(1, len(rank)):
        if rank[i][1] < rank[top][1]:
            top = i
            result += 1
    
    print(result)
import sys
input = sys.stdin.readline

def dfs(start, visited, s, b):
    global answer

    if b != 0:
        answer = min(answer, abs(s-b))

    for i in range(start, n):
        if not visited[i]:
            visited[i] =True
            dfs(start+1, visited, s*arr[i][0], b+arr[i][1])
            visited[i] = False

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]

answer = int(1e9)
visited = [False] * n
dfs(0, visited, 1, 0)
print(answer)
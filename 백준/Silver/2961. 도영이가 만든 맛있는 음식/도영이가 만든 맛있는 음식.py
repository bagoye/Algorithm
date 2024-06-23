import sys
input = sys.stdin.readline

def dfs(idx, s, b, use):
    global answer

    if idx == n:
        if use > 0:
            result = abs(s-b)
            answer = min(answer, result)
        return

    dfs(idx + 1, s*arr[idx][0], b+arr[idx][1], use+1)
    dfs(idx + 1, s, b, use)

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
answer = int(1e9)
dfs(0, 1, 0, 0)
print(answer)
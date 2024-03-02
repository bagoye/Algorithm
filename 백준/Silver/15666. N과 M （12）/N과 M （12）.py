import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
res = []


def dfs(start):
    if len(res) == m:
        print(*res)
        return

    temp = 0
    for i in range(start, n):
        if temp != arr[i]:
            res.append(arr[i])
            temp = arr[i]
            dfs(i)
            res.pop()
dfs(0)
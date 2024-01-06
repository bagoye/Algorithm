n, m = map(int, input().split())
ans = []

def dfs(start):
    # 현재까지 찾은 순열의 길이가 m과 같으면 순열을 출력
    if len(ans) == m:
        print(*ans)
        return

    # 순열에 추가할 숫자를 결정하는 반복문
    for i in range(start, n + 1):
        ans.append(i)
        dfs(i)
        ans.pop()

dfs(1)
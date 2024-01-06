n, m = map(int, input().split())
ans = []

def dfs():
    # 현재까지 찾은 순열의 길이가 m과 같으면 순열을 출력
    if len(ans) == m:
        print(*ans)
        return

    # 순열에 추가할 숫자를 결정하는 반복문
    for i in range(1, n + 1):
        ans.append(i)
        dfs()
        ans.pop()

dfs()
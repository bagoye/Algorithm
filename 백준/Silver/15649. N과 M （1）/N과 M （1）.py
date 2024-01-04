n, m = map(int,input().split())
ans = []

def backtracking():
    if len(ans) == m: # 길이가 m인 조합을 찾은 경우 출력하고 함수 끝
        print(*ans)
        return

    for i in range(1, n+1): # 아니면 모든 숫자 반복
        if i not in ans:
            ans.append(i)
            backtracking() # 재귀
            ans.pop()

backtracking()
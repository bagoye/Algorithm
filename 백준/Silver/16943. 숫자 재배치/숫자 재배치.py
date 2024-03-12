import sys
input = sys.stdin.readline

a, b = map(str, input().split())
a = list(a)
b = list(b)
length = len(a)
checked = [False] * length
answer = -1

# 이 때, num은 문자처럼 취급한다는 점을 주의할 것
def dfs(idx, num):
    global answer
    if idx == length:
        if int(num) <= int(''.join(map(str, b))):
            answer = max(answer, int(num))
        return
    for i in range(length):
        if idx == 0 and a[i] == "0":
            continue
        if not checked[i]:
            checked[i] = True
            dfs(idx + 1, num + a[i])
            checked[i] = False

dfs(0, '')
print(answer)
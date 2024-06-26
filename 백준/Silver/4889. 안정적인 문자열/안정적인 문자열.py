import sys
input = sys.stdin.readline

t = 1
while True:
    stack = []
    cnt = 0
    s = input().rstrip()
    if '-' in s:
        break

    for i in s:
        if i == "{":
            stack.append(i)
        else:
            if stack:
                stack.pop()
            else:
                cnt += 1
                stack.append('{')

    cnt += len(stack) // 2
    print(f"{t}. {cnt}")
    t += 1

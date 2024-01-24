import sys
input = sys.stdin.readline

test = input().strip()
stack = []
ans = ''
icp = {'+':1, '-':1, '*':2, '/':2, '(': 3, ')':0}
isp = {'+':1, '-':1, '*':2, '/':2, '(': 0, ')':0}
for i in test:
    if i in icp:
        if i == ')':
            while stack[-1] != '(':
                ans += stack.pop()
            stack.pop()
        else:
            while stack and icp[i] <= isp[stack[-1]]:
                ans += stack.pop()
            stack.append(i)
    else:
        ans += i

while stack:
    ans += stack.pop()

print(ans)
import sys
input = sys.stdin.readline

r = list(input().rstrip())
answer = 0
stack = []

for i in range(len(r)):
    if r[i] == '(':
        stack.append('(')
        
    else:
        if r[i-1] == '(':
            stack.pop()
            answer += len(stack)
            
        else:
            stack.pop() 
            answer += 1

print(answer)
test = input()
S = []
rlt = ''
icp = {'+':1, '-':1, '*':2, '/':2, '(': 3, ')':0}
isp = {'+':1, '-':1, '*':2, '/':2, '(': 0, ')':0}
for i in test:
    if i in icp:
        if i == ')':
            while S[-1] != '(':
                rlt += S.pop()
            S.pop()
        else:       # 나머지연산자
            while S and icp[i] <= isp[S[-1]]:
                rlt += S.pop()
            S.append(i)
    else:
        rlt += i

while S:
    rlt += S.pop()

print(rlt)
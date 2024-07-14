import sys
input = sys.stdin.readline

n, m = map(int, input().split())
dic1, dic2 = {}, {}
for _ in range(n):
    team = input().rstrip()
    members = []
    for i in range(int(input())):
        name = input().rstrip()
        dic1[name] = team
        members.append(name)
    dic2[team] = members

for _ in range(m):
    quiz = input().rstrip()
    num = int(input())
    if num == 1:
        print(dic1[quiz])
    else:
        member = dic2[quiz]
        print('\n'.join(sorted(member)))
import sys
input = sys.stdin.readline

s = []
for _ in range(int(input())):
    com = input().split()

    if com[0] == "1":
        s.append(com[1])
    elif com[0] == "2":
        if s:
            print(s.pop())
        else:
            print(-1)
    elif com[0] == "3":
        print(len(s))
    elif com[0] == "4":
        if s:
            print(0)
        else:
            print(1)
    elif com[0] == "5":
        if s:
            print(s[-1])
        else:
            print(-1)

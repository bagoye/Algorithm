import sys

input = sys.stdin.readline

while True:
    words = input().rstrip()
    s = []
    if words == ".":
        break

    for i in words:
        if i == "(" or i == "[":
            s.append(i)
        elif i == ")":
            if len(s) != 0 and s[-1] == "(":
                s.pop()
            else:
                s.append(i)
                break

        elif i == "]":
            if len(s) != 0 and s[-1] == "[":
                s.pop()
            else:
                s.append(i)
                break

    if len(s) == 0:
        print("yes")
    else:
        print("no")
import sys

input = sys.stdin.readline

while True:
    try:
        s, t = input().rstrip().split()
        first = list(s)
        for i in t:
            if first and i == first[0]:
                first.pop(0)
        if not first:
            print("Yes")
        else:
            print("No")
    except:
        break
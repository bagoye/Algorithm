import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n, m = map(int, input().split())
    a = sorted(list(map(int, input().split())))
    b = sorted(list(map(int, input().split())))

    s1, s2 = 0, 0
    cnt = 0

    while s1 < n:
        if s2 == m:
            cnt += s2
            s1 += 1
        else:
            if a[s1] > b[s2]:
                s2 += 1
            else:
                cnt += s2
                s1 += 1
    print(cnt)
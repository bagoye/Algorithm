import sys

input = sys.stdin.readline

n, m = map(int, input().split())
dna = [list(input().rstrip()) for _ in range(n)]

cnt = 0
answer = ''

for i in range(m):
    a, c, g, t= 0, 0, 0, 0

    for j in range(n):
        if dna[j][i] == "A":
            a += 1
        elif dna[j][i] == "C":
            c += 1
        elif dna[j][i] == "G":
            g += 1
        elif dna[j][i] == "T":
            t += 1

    if max(t, a, g, c) == a:
        answer += "A"
        cnt += c + g + t
    elif max(t, a, g, c) == c:
        answer += "C"
        cnt += a + g + t
    elif max(t, a, g, c) == g:
        answer += "G"
        cnt += a + c + t
    elif max(t, a, g, c) == t:
        answer += "T"
        cnt += c + g + a

print(answer)
print(cnt)
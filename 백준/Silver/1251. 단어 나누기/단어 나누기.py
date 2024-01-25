import sys
input = sys.stdin.readline

word = list(map(str, input().rstrip()))
ans = []

for i in range(1, len(word) - 1):
    for j in range(i + 1, len(word)):
        first = word[:i]
        second = word[i:j]
        third = word[j:]

        first.reverse()
        second.reverse()
        third.reverse()

        ans.append("".join(first + second + third))

print(min(ans))
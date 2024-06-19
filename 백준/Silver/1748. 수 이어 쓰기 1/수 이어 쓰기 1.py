import sys

input = sys.stdin.readline

n = input().rstrip()
length = len(n) - 1
answer = 0

for i in range(length):
    answer += 9 * (10 ** i) * (i + 1)
    i += 1
answer += ((int(n) - (10 ** length)) + 1) * (length + 1)

print(answer)
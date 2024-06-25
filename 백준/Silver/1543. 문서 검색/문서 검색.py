import sys

input = sys.stdin.readline

doc = input().rstrip()
search = input().rstrip()
idx = 0
cnt = 0
while idx < len(doc):
    if doc[idx:idx+len(search)] == search:
        idx += len(search)
        cnt += 1
    else:
        idx += 1
print(cnt)
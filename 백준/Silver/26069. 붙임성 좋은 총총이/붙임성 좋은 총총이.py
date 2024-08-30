import sys
input = sys.stdin.readline

n = int(input())
people = {'ChongChong'}

for i in range(1, n+1):
    a, b = input().rstrip().split()

    if a in people:
        people.add(b)

    if b in people:
        people.add(a)

print(len(people))
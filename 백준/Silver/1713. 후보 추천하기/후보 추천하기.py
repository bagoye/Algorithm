import sys

input = sys.stdin.readline

n = int(input())
r = int(input())
students = list(map(int, input().split()))
pic = []
score = []

for i in range(r):
    if students[i] in pic:
        for j in range(len(pic)):
            if students[i] == pic[j]:
                score[j] += 1
    else:
        if len(pic) >= n:
            for j in range(n):
                if score[j] == min(score):
                    pic.remove(pic[j])
                    score.remove(score[j])
                    break
        pic.append(students[i])
        score.append(1)

pic.sort()
print(*pic)
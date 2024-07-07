import sys
input = sys.stdin.readline

total = 0
tree = dict()

while True:
    word = input().rstrip()
    if word == "":
        break
    total += 1
    if word in tree:
        tree[word] += 1
    else:
        tree[word] = 1

tree = dict(sorted(tree.items()))
for i in tree:
    per = (tree[i] / total * 100)
    print(f"{i} {per:.4f}")

def inorder(v):
    if v > N:
        return
    inorder(v * 2)              # 왼쪽
    print(tree[v], end='')      # 중위순회
    inorder(v * 2 + 1)          # 오른쪽

for tc in range(1, 11):
    N = int(input())            # 정점의 총 수
    tree = [0] * (N + 1)

    for i in range(N):
        arr = list(input().split())
        tree[i+1] = arr[1]

    print(f'#{tc}', end=' ')
    inorder(1);
    print()
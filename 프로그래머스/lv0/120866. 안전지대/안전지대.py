
# 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
# 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과,
# 지뢰가 없는 지역 0만 존재합니다.

def solution(board):
    n = len(board)
    dr = [-1, 1, 0, 0, 1, 1, -1, -1]    # 상, 하, 좌, 우, 대각선
    dc = [0, 0, -1, 1, 1, -1, -1, 1]

    bomb = []
    for r in range(n):                  # 행인덱스
        for c in range(n):              # 열인덱스
            if board[r][c] == 1:        # 폭탄 위치
                bomb.append([r, c])       # 폭탄 위치 추가

    for r, c in bomb:
        for i in range(8):
            nr, nc = r + dr[i], c + dc[i]
            if 0 <= nr < n and 0 <= nc < n:
                board[nr][nc] = 1       # 위험지역에 1 추가

    cnt = 0
    for r in range(n):
        for c in range(n):
            if board[r][c] == 0:        # 0인 부분만 카운팅
                cnt += 1

    return cnt
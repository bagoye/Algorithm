import sys
input = sys.stdin.readline

vowel = ['a', 'e', 'i', 'o', 'u']

while True:
    password = input().rstrip()
    if password == 'end':
        break
    # 모음 개수 카운트
    cnt = 0
    # 규칙 위반 여부 플래그
    x, y = 0, 0

    for i in vowel:
        if i in password:
            cnt += 1

    # 모음이 없는 경우
    if cnt < 1:
        print(f"<{password}> is not acceptable.")
        continue

    for i in range(len(password) - 2):
        # 모음 3개 연속 규칙 위반
        if password[i] in vowel and password[i+1] in vowel and password[i+2] in vowel:
            x = 1
        # 자음 3개 연속 규칙 위반
        elif not (password[i] in vowel) and not (password[i + 1] in vowel) and not (password[i + 2] in vowel):
            x = 1
    if x == 1:
        print(f"<{password}> is not acceptable.")
        continue

    for i in range(len(password) - 1):
        if password[i] == password[i + 1]:
            # 'ee' 또는 'oo'는 허용
            if password[i] == 'e' or password[i] == 'o':
                continue
            # 같은 문자 연속 규칙 위반
            else:
                y = 1

    if y == 1:
        print(f"<{password}> is not acceptable.")
        continue

    print(f"<{password}> is acceptable.")
for tc in range(1, 11):
    _ = int(input())
    s = input()
    string = input()
    result = 0
    for i in range(len(string)):
        if string[i] == s[0]:
            if string[i:i+len(s)] == s:
                result += 1


    print(f"#{tc}", result)
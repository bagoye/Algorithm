def solution(s):
    st = ''
    s = s.split(' ')
    for i in range(len(s)):
        if s[i]:
            if i == len(s)-1:
                st += s[i][0].upper() + s[i][1:].lower()
            else:
                st += s[i][0].upper() + s[i][1:].lower() + ' '
        elif i!=len(s)-1:st+=' '
    return st
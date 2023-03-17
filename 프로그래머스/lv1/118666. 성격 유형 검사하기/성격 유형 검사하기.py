d = {'R':0, 'T':0, 'C':0, 'F':0, 'J':0, 'M':0, 'A':0, 'N':0}
def solution(survey, choices):
    for i in range(len(survey)):
        if choices[i] > 4:d[survey[i][1]] += choices[i] - 4
        else:d[survey[i][0]] += abs(choices[i] - 4)
    p = ''
    if d['R'] < d['T']: p+='T'
    else:p+='R'
    if d['C'] < d['F']: p+='F'
    else:p+='C'
    if d['J'] < d['M']: p+='M'
    else:p+='J'
    if d['A'] < d['N']: p+='N'
    else:p+='A'
    return p
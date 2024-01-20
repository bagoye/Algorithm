import sys
input = sys.stdin.readline

company = dict()

for _ in range(int(input())):
  name, rec = map(str, input().split())
  if rec == 'enter':
    company[name] = True
  else:
    del company[name]
  
company = sorted(company.keys(), reverse=True)

for i in company:
  print(i)
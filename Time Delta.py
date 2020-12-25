from dateutil import parser
n=int(input())
for i in range(n):
    d1=parser.parse(input().strip())
    d2=parser.parse(input().strip())
    print(abs(int((d1-d2).total_seconds())))

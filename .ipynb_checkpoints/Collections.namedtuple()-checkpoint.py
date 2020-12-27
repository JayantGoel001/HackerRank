from collections import namedtuple
n=int(input())
spread=namedtuple('spread',input())
marks=[int(spread._make(input().split()).MARKS) for _ in range(n)]
print(sum(marks)/len(marks))
import collections
n=int(input())
l=list(map(int,input().split()))
s=collections.Counter(l)
if(len(l)==len(s)):
    print("-1")
else:
    min=999999999999
    for value,key in s.items():
        if(key!=1):
            x=l.index(value)
            y=l.index(value,x+1)
            m=abs(x-y)
            if(m<min):
                min=m;
    print(min)
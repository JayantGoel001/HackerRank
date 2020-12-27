n=int(input())
l=list(map(int,input().split()))
dic={}
for i in range(1,len(l)+1):
    dic[i]=l[i-1]
for i in range(1,len(l)+1):
    if(dic[dic[i]]!=i):
        print("NO")
        break
else:
    print("YES")

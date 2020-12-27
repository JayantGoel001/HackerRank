n=int(input())
l=list(map(int,input().split()))
for i in range(1,len(l)+1):
    if i not in l:
        print("NO")
        break
else:
    print("YES")

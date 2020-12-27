n=int(input())
for _ in range(n):
    x=int(input())
    l=list(map(int,input().split()))
    #s=sum(l)
    a=l[0]
    b=sum(l[2:])
    if x==1:
        print("YES")
    else:
        for i in range(1,x-1):
        #print(a,b)
            if a==b or 0==b or a==0:
                print("YES")
                break
            a+=l[i]     
            b-=l[i+1]
        else:
            print("NO")
        

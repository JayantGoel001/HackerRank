n=int(input())
for i in range(n):
    price=int(input())
    x=int(input())
    l=list(map(int,input().split()))
    for j in range(0,x):
        w=price-l[j]
        z=l[j+1:]
        #print(z,"*")
        if w in z:
            print(j+1,z.index(w)+1+len(l)-len(z))
            break

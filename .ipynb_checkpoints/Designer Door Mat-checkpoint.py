x,y=list(map(int,input().split()))
for i in range(1,x+1):
    if(i<=x//2):
        for j in range(0,y//2-3*(i)+2):
            print("-",end='')
        for j in range(0,2*i-1):
            print(".|.",end="")
        for j in range(0,y//2-3*i+2):
            print("-",end="")
        print()
    elif(i==x//2+1):
        for j in range(0,y//2-3):
            print("-",end="")
        print("WELCOME",end="")
        for j in range(0,y//2-3):
            print("-",end="")
        print()
    else:
        i1=x-i
        for j in range(y//2-3*(i1),1,-1):
            print("-",end="")
        for j in range(2*i1-1,-2,-1):
            print(".|.",end="")
        for j in range(y//2-3*i1,1,-1):
            print("-",end="")
        print()

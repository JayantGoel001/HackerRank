def check(l,x,y,l1,a,b):
    c=0
    for i in range(a):
        for j in range(b):
            if(l2[i][j]==l[x+i][y+j]):
                c+=1
    if(c==a*b):
        return True
    else:
        return False
def find(l,x,y,l2,a,b):
    for i in range(x-a+1):
        for j in range(y-b+1):
            if(l[i][j]==l2[0][0] and l[i+a-1][j+b-1]==l2[a-1][b-1] and l[i+a-1][j]==l2[a-1][0] and l[i][j+b-1]==l2[0][b-1]):
                if(check(l,i,j,l2,a,b)==True):
                    return True
    else:
        return False
n=int(input())
for i in range(n):
    x,y=map(int,input().split())
    l=[0]*x
    for i in range(x):
        l[i]=list(input())
    a,b=map(int,input().split())
    l2=[0]*a
    for i in range(a):
        l2[i]=list(input())
    #print(l,l2)
    if(find(l,x,y,l2,a,b)==True):
        print("YES")
    else:
        print("NO")
    

n=int(input())
for i in range(n):
    tot,each,wrap=input().split()
    tot=int(tot)
    each=int(each)
    wrap=int(wrap)
    x=tot//each
    wr=x
    wr1=wr//wrap
    while(wr1!=0):
        w=wr%wrap
        x+=wr1
        wr=wr1+w
        wr1=wr//wrap
    print(x)


n=int(input())
l1=set(map(int,input().split()))
x=int(input())
for i in range(x):
    st,num=input().split()
    num=int(num)
    l=set(map(int,input().split()))
    if(st=="intersection_update"):
        l1.intersection_update(l)
    elif(st=="update"):
        l1.update(l)
    elif(st=="symmetric_difference_update"):
        l1.symmetric_difference_update(l)
    else:
        l1.difference_update(l)
print(sum(l1))
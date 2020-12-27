import math
n=int(input())
for i in range(n):
    x=int(input())
    i=1
    play=0
    while(x!=1):
        lower=math.floor(math.log(x,2))
        upper=math.ceil(math.log(x,2))
        #print(lower,upper)
        if(2**lower==x):
            x=x//2
        elif(2**lower<x and 2**upper>x):
            x=x-2**lower
        play+=1
    if(play%2!=0):
        print("Louise")
    else:
        print("Richard")


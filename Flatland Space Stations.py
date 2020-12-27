n,m=map(int,input().split())
st=list(map(int,input().split()))
if(n==m):
    print("0")
else:
    # max1=-9999999999999
    # for i in range(n):
    #     min1=9999999999999
    #     for j in range(m):
    #         if min1>abs(i-st[j]):
    #             min1=abs(i-st[j])
    #         if min1==0:
    #             break
    # #print(l2)
    #     if max1<min1:
    #         max1=min1
    if(m!=1):
        st.sort()
        max1=st[1]-st[0]
        for i in range(1,m-1):
            x=st[i+1]-st[i]
            if(x>max1):
                max1=x
        w=n-max(st)-1
        #print(w,max1)
        if(w>=max1//2):
            #print("*")
            max1=n-max(st)-1
            if(min(st)>max1):
                max1=min(st)
            print(max1)
        else:
            if(min(st)>max1):
                max1=min(st)
                print(min(st))
            else:
                print(max1//2)
    else:
        print(n-m)

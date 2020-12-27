n=int(input())
for i in range(n):
    st=list(input())
    if(len(st)%2==0):
        st1=st[0:len(st)//2]
        st2=st[len(st)//2:]
        l1=[0]*26
        for j in range(len(st1)):
            l1[ord(st1[j])-97]+=1
        for j in range(len(st2)):
            l1[ord(st2[j])-97]-=1
        s=0
        for j in range(26):
            s+=abs(l1[j])
        print(s//2)
    else:
        print("-1")

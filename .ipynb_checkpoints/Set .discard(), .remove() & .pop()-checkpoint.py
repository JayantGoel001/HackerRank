n = int(input())
s = set(map(int, input().split()))
c=int(input())
for i in range(0,c):
    st=input()
    if(st=="pop"):
        s.pop()
    else:
        st,x=st.split()
        x=int(x)
        if(st=="remove"):
            s.remove(x)
        else:
            s.discard(x)
print(sum(s))
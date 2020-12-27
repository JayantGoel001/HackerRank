from collections import deque
n=int(input())
d=deque()
for i in range(n):
    st=input()
    if st[0]=='a':
        st,x=st.split()
        x=int(x)
        if st[-1]=='d':
            d.append(x)
        else:
            d.appendleft(x)
    else:
        if st[-1]=='p':
            d.pop()
        else:
            d.popleft()
for i in range(len(d)):
    print(d[i],end=" ")
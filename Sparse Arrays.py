n=int(input())
st=[]
for i in range(n):
    st.append(input())
q=int(input())
qt=[]
for i in range(q):
    qt.append(input())
#print(qu)
l=[]
for i in range(int(q)):
    l.append(st.count(qt[i]))
    print(l[i])

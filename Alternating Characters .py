n = int(input())
for i in range(n):
    st = str(input())
    c=0
    for s in range(0,len(st)-1):
        if st[s]==st[s+1]:
            c+=1
    print(c)

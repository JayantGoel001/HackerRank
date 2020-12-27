n=int(input())
w=4294967295
#print(w)
for _ in range(n):
    x=int(input())
    #x=int("{0:b}".format(x))
    res=w-x
    print(res)

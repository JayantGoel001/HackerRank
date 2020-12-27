def wrapper(f):
    def fun(l):
        # complete the function
        l2=[]
        for i in l:
            i=int(i)%pow(10,10)
            i=str(i)
            l2.append(i)
        l2.sort()
        for i in l2:
            print("+91 "+i[0:5]+" "+i[5:10])
    return fun
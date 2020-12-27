if __name__ == '__main__':
    N = int(input())
    l=[]
    arr=[]
    for i in range(0,N):
        s=input().split();
        st=s[0]
        arr=list(map(int,s[1:]))
        #print(s)
        if(st =="insert"):
            #arr=list(map(int,l))
            l.insert(arr[0],arr[1])
        elif(st=="print"):
            print(l)
        elif(st=="remove"):
            l.remove(arr[0])
        elif(st=="append"):
            l.append(arr[0])
        elif(st=="sort"):
            l.sort()
        elif(st=="pop"):
            l.pop()
        elif(st=="reverse"):
            l.reverse()
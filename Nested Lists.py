if __name__ == '__main__':
    l=[]
    l2=[]
    for _ in range(int(input())):
        name = input()
        score = float(input())
        l.append(name)
        l2.append(score)
    #print (l)
    #print(l2)
    mini=min(l2)
    small=99999
    for i in range(len(l2)):
        if(l2[i]<small and l2[i]!=mini):
            small=l2[i]
    l3=[]
    for i in range(len(l2)):
        if(small==l2[i]):
            l3.append(l[i])
    l3.sort()
    for i in range(len(l3)):
        print(l3[i])

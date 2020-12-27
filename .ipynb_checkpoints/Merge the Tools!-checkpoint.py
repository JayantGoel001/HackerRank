def removeduplicate(x):
    l=[]
    for i in range(len(x)):
        if x[i] not in l:
            l.append(x[i])
    st="".join(l)
    print(st)

def merge_the_tools(string, k):
    for i in range(0,len(string),k):
        x=string[i:i+k]
        removeduplicate(x)
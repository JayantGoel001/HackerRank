def count_substring(string, sub_string):
    l1=len(string)
    l2=len(sub_string)
    c=0
    for i in range(0,l1-l2+1):
        s=string[i:i+l2]
        if(s == sub_string):
            c=c+1
    return c
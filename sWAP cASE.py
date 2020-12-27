def swap_case(s):
    str=""
    for i in range(0,len(s)):
        x=ord(s[i])
        if(x>=65 and x<=90):
            str=str+chr(x+32)
        elif(x>=97 and x<=122):
            str=str+chr(x-32)
        else:
            str=str+chr(x)
    return str


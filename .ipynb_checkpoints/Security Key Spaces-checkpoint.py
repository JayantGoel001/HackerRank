n=input()
k=int(input())
for i in range(len(n)):
    x=ord(n[i])
    if (x>65 and x<90) or (x>97 and x<122):
        print(chr((x+1)),end="")
    elif(x==65 or x==90 or x==97 or x==122):
        print(chr((x+1-26)),end="")
    elif(x>=48 and x+k<=57):
        print(chr((x+k)),end="")
    elif(x+k>57):
        print(chr(x+k-10),end="")
    else:
        print(chr(x),end="")
# Enter your code here. Read input from STDIN. Print output to STDOUT
n=input()
#print(n[0])
for i in range(len(n)):
    x=ord(n[i])
    if (x>65 and x<90) or (x>97 and x<122):
        print(chr((x+1)),end="")
    elif(x==65 or x==90 or x==97 or x==122):
        print(chr((x+1-26)),end="")
    elif(x>=48 and x<57):
        print(chr((x+1)),end="")
    elif(x==57):
        print(chr(x+1-10),end="")
    else:
        print(chr(x),end="")



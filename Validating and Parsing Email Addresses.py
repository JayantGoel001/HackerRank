# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
n=int(input())
for i in range(n):
    st,email=input().split()
    #email=email[1:-1]
    #print(st,email)
    if(re.match("<[a-zA-Z](\w|-|\.|_)+\@[a-zA-Z]+\.[a-zA-Z]{1,3}>",email)):
        print(st,email)

import re
n=int(input())
for i in range(n):
    st,email=input().split()
    if(re.match("<[a-zA-Z](\w|-|\.|_)+\@[a-zA-Z]+\.[a-zA-Z]{1,3}>",email)):
        print(st,email)

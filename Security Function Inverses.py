# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
l=list(map(int,input().split()))
dic={}
for i in range(1,len(l)+1):
    dic[l[i-1]]=i
for i in range(1,len(l)+1):
    print(dic[i])

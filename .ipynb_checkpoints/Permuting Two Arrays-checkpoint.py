n=int(input())
for _ in range(n):
    size,k=map(int,input().split())
    l1=list(map(int,input().split()))
    l2=list(map(int,input().split()))
    l1.sort()
    l2.sort(reverse=True)
    for i in range(size):
        if l1[i]+l2[i]<k:
            print("NO")
            break
    else:
        print("YES")
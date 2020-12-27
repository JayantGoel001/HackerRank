n=int(input())
for i in range(n):
    x=input()
    y=input()
    for i in x:
        if i in y:
            print("YES")
            break
    else:
        print("NO")

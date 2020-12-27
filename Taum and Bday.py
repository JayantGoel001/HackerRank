n=int(input())
for i in range(n):
    b,w=input().split()
    b=int(b)
    w=int(w)
    bc,wc,z=input().split()
    bc=int(bc)
    wc=int(wc)
    z=int(z)
    if(wc==bc+z or wc+z==bc or wc==bc or(z>bc and z>wc)):
        cost=wc*w+bc*b
        print(cost)
    else:
        if bc>wc+z:
            cost=(b+w)*wc+b*z
            print(cost)
        elif wc>bc+z:
            cost=(b+w)*bc+w*z
            print(cost)
        else:
            cost=wc*w+bc*b
            print(cost)

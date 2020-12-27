def libraryFine(d1, m1, y1, d2, m2, y2):
    fine = 0
    if y1>y2:
        fine = 10000
    elif y1<=y2:
        if m1>m2 and (y1>=y2):
            fine = 500 * (m1-m2)
        elif m1<=m2:
            if (d1>d2 and (m1-m2>=0) and (y1>=y2)):
                fine = 15*(d1-d2)
            else:
                fine = 0
    return fine
d1,m1,y1=input().split()
d1=int(d1)
m1=int(m1)
y1=int(y1)
d2,m2,y2=input().split()
d2=int(d2)
m2=int(m2)
y2=int(y2)
print(libraryFine(d1,m1,y1,d2,m2,y2))

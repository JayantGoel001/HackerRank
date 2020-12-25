row,col=map(int,input().split())
if row%2==0:
    row=(row-2)*5+1
else:
    row=(row-1)*5
print(row+2*col-2)


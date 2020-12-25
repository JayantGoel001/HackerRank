import math
x=float(input())
y=float(input())
print(int(round(math.degrees(math.atan2(x,y)))),end="")
print("°")

import calendar
mm,dd,yy=map(int,input().split())
x=calendar.weekday(yy,mm,dd)
if x==6:
    print("SUNDAY")
elif x==0:
    print("MONDAY")
elif x==1:
    print("TUESDAY")
elif x==2:
    print("WEDNESDAY")
elif x==3:
    print("THURSDAY")
elif x==4:
    print("FRIDAY")
elif x==5:
    print("SATURDAY")
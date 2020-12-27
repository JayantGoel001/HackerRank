def is_leap(year):
    leap = False
    if(((year%100==0)and(year%4==0))and(year%400!=0)):
        return leap;
    elif(year%4==0):
        return True
    else:
        return False    
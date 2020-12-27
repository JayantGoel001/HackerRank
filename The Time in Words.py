def name(n):
    if(n==1):
        return "one"
    if(n==2):
        return "two"
    if(n==3):
        return "three"
    if(n==4):
        return "four"
    if(n==5):
        return "five"
    if(n==6):
        return "six"
    if(n==7):
        return "seven"
    if(n==8):
        return "eight"
    if(n==9):
        return "nine"
    if(n==10):
        return "ten"
    if(n==11):
        return "eleven"
    if(n==12):
        return "twelve"
    if(n==13):
        return "thirteen"
    if(n==14):
        return "fourteen"
    if(n==15):
        return "quarter"
    if n==16:
        return "sixteen"
    if n==17:
        return "seventeen"
    if n==18:
        return "eighteen"
    if n==19:
        return "nineteen"
    if n==20:
        return "twenty"
    if n==21:
        return "twenty one"
    if n==22:
        return "twenty two"
    if n==23:
        return "twenty three"
    if n==24:
        return "twenty four"
    if n==25:
        return "twenty five"
    if n==26:
        return "twenty six"
    if n==27:
        return "twenty seven"
    if n==28:
        return "twenty eight"
    if n==29:
        return "twenty nine"
    if n==30:
        return "half"
hr=int(input())
mi=int(input())
if(mi>30):
    x=" to "
    hr+=1
    hr=hr%13
    mi=60-mi
else:
    x=" past "
if mi==0:
    print(name(hr)+" o\' clock",end="")
elif(mi!=15 and mi!=30 and mi!=1):
    print(name(mi)+" minutes"+x+name(hr),end="")
elif(mi!=15 and mi!=30 ):
    print(name(mi)+" minute"+x+name(hr),end="")
else:
    print(name(mi)+x+name(hr),end="")

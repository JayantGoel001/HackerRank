import re
def fun(s):
    l=re.findall("^[a-zA-Z0-9_-]+\@[a-zA-Z0-9]+\.[a-zA-Z]{0,3}$",s)
    if(len(l)==0):
        return False
    else:
        return True
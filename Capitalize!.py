

# Complete the solve function below.
def solve(s):
    l=list(s.split(" "))
    x=[]
    for i in range(len(l)):
        x.append(l[i].capitalize())
    return " ".join(x)


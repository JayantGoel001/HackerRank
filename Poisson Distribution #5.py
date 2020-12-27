import math
def prob(page,error,mean=1.2):
    return (((mean*page)**error)*math.exp(-mean*page))/math.factorial(error)
first=prob(1,2)
second=prob(1,0)+prob(1,1)+prob(1,2)
third=prob(10,5)
fourth=1-(prob(40,0)+prob(40,1)+prob(40,2))
print(first)
print(second)
print(third)
print(fourth)

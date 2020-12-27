# Enter your code here. Read input from STDIN. Print output to STDOUT
x=1/3
y=5
sum=1
for i in range(1,y):
    sum=sum*(1-x)
sum=sum*x
print("%.3f"%(sum))

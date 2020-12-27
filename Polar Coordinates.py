# Enter your code here. Read input from STDIN. Print output to STDOUT
import cmath
x=complex(input())
print(abs(complex(x.real,x.imag)))
print(cmath.phase(complex(x.real,x.imag)))

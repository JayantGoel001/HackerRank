import cmath
x=complex(input())
print(abs(complex(x.real,x.imag)))
print(cmath.phase(complex(x.real,x.imag)))

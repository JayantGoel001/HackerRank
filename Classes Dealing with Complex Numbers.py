

class Complex(object):
    def __init__(self, real, imaginary):
        self.real=real
        self.imaginary=imaginary
    def __add__(self, no):
        #__init__(self)
        #__new__(self)
        x=no.real+self.real
        y=no.imaginary+self.imaginary
        return Complex(x,y)
    def __sub__(self, no):
        x=self.real-no.real
        y=self.imaginary-no.imaginary
        return Complex(x,y)
    def __mul__(self, no):
        x=self.real*no.real-self.imaginary*no.imaginary
        y=self.imaginary*no.real+self.real*no.imaginary
        return Complex(x,y)
    def __truediv__(self, no):
        m=no.real**2+no.imaginary**2
        x=(self.real*no.real+self.imaginary*no.imaginary)/m
        y=(self.imaginary*no.real-self.real*no.imaginary)/m
        return Complex(x,y)
    def mod(self):
        return Complex(math.sqrt(self.imaginary**2 + self.real**2),0)
    def __str__(self):
        if self.imaginary == 0:
            result = "%.2f+0.00i" % (self.real)
        elif self.real == 0:
            if self.imaginary >= 0:
                result = "0.00+%.2fi" % (self.imaginary)
            else:
                result = "0.00-%.2fi" % (abs(self.imaginary))
        elif self.imaginary > 0:
            result = "%.2f+%.2fi" % (self.real, self.imaginary)
        else:
            result = "%.2f-%.2fi" % (self.real, abs(self.imaginary))
        return result


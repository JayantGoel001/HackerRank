Complex operator+(Complex &x,Complex &y)
{
    Complex temp;
    temp.a=x.a+y.a;
    temp.b=x.b+y.b;
    return temp;
}
ostream& operator<<(ostream &os,Complex &x)
{
    return os<<x.a<<(x.b>0?'+':'-')<<"i"<<x.b;
}

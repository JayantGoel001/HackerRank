class Box
{
    public:
    int l,b,h;
    public:
    Box()
    {
        l=0;
        b=0;
        h=0;
    }
    Box(int length,int breadth,int height)
    {
        l=length;
        b=breadth;
        h=height;
    }
    Box(Box &B)
    {
        l=B.l;
        b=B.b;
        h=B.h;
    }
    int getLength()
    {
        return l;
    }
    int getBreadth()
    {
        return b;
    }
    int getHeight()
    {
        return h;
    }
    long long CalculateVolume()
    {
        return (long long)l*b*h;
    }
    bool operator<(Box &B)
    {
        if(l<B.l)
        {
            return true;
        }
        else if(b<B.b&&l==B.l)
        {
            return true;
        }
        else if(h<B.h&&b==B.b&&l==B.l)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }    
};
ostream &operator<<(ostream &out, const Box &B)
 {
  out << B.l << " " << B.b << " " << B.h;
  return out;
}

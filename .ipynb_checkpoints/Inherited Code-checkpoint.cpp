class BadLengthException
{
    public :
      int n;
    public :
       BadLengthException(int n)
       {
           this->n=n;
       }
       int what()
       {
           return n;
       }
};
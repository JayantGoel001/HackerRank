
class MyBook extends Book
{
    int price;
    MyBook(String t,String a,int pr)
    {
        super(t,a);
        price=pr;
    }
    void display()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}

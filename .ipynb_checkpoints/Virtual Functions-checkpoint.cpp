class Person
{
    public:
    char name[100];
    int age;
    virtual void getdata()
    {
        cin>>this->name;
        cin>>this->age;
    }
    virtual void putdata()
    {
        cout<<this->name<<" "<<this->age<<" ";
    }
};

class Professor :public Person
{
    public:
    int publications;
    static int id;
    int cur_id;
    void getdata()
    {
        cin>>this->name;
        cin>>this->age;
        cin>>publications;
        this->cur_id=++id;
    }
    void putdata()
    {
        cout<<this->name<<" "<<this->age<<" ";
        cout<<publications<<" "<<this->cur_id<<endl;
    }
};
int Professor ::id=0;
class Student:public Person
{
    public:
    int marks[6];
    int cur_id;
    static int id;
    void getdata()
    {
        cin>>this->name;
        cin>>this->age;
        for(int i=0;i<6;i++)
        {
            cin>>marks[i];
        }
        cur_id=++id;
    }
    void putdata()
    {
        int sum=0;
        cout<<this->name<<" "<<this->age<<" ";
        for(int i=0;i<6;i++)
        {
            sum+=marks[i];
        }
        cout<<sum<<" "<<cur_id<<endl;
    }
};
int Student::id=0;

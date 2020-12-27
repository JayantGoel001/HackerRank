void process_input(int n) {
    try
    {
      int d = largest_proper_divisor(n);
      cout << "result=" << d << endl;
    }
    catch(invalid_argument e)
    {
        cout<<e.what()<<endl;
    }
    cout<<"returning control flow to caller"<<endl;
}
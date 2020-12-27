
static int a;
            try {

              if (A > 1073741823) {
                a++;
                throw std::bad_alloc();
              }
              cout << Server::compute(A, B) << endl;
              if (T == 0) {
                cout << Server::getLoad() + a<<endl;
                return 0;
              }
}catch(std::bad_alloc &e)
{
    cout<<"Not enough memory"<<endl;
    if (T == 0) {
      cout << Server::getLoad() + a<<endl;
      return 0;
    }
}
catch (std::exception &e) {
  cout <<"Exception: " << e.what() << endl;
  if (T == 0) {
    cout << Server::getLoad() + a <<endl;
    return 0;
  }
}catch(...)
{
    cout<<"Other Exception"<<endl;
    if (T == 0) {
      cout << Server::getLoad() + a <<endl;
      return 0;
    }
}



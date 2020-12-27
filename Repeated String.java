/*#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

int main() {
  string s;
  cin >> s;
  ll n;
  cin >> n;
  ll ans = 0;
  int A = 0;
  int B = 0;
  for (int i = 0; i < (int)s.size(); i++) {
    if (s[i] == 'a')
      A++;
    if ((ll)i < n % (ll)s.size() && s[i] == 'a')
      B++;
  }

  cout << n / (ll)s.size() * (ll)A + (ll)B << endl;
  return 0;
}*/
import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        String str;
        long n;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        n=sc.nextLong();
        int a=0,b=0;
        for(int i=0;i<(int)str.length();i++)
        {
            if(str.charAt(i)=='a')
            {
                a++;
            }
            if((long)i<n%(long)str.length()&&str.charAt(i)=='a')
            {
                b++;
            }
        }
        System.out.println(n/(long)str.length()*(long)a+(long)b);

    }
}

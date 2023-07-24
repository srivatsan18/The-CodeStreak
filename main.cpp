/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <bits/stdc++.h>

using namespace std;

int
main ()
{
  vector < int >a;
  int num = 10;
  for (int i = 0; i < num; i++)
    {
      int placeholder;
      cin >> placeholder;
      a.push_back (placeholder);
    }

  sort (a.begin (), a.end ());
  for (int i = 0; i < num; i = i + 2)
    {
      if (a[i] != a[i + 1])
	{
	  cout << a[i] << "is the value at pos" << i;
	  break;
	}
    }



  return 0;
}

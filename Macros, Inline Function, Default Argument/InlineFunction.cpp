#include <iostream>
using namespace std;

inline int getMax(int &a, int &b)
{
    // one line statement
    // before compile, we replace the body of an inline function with the function call
    // no extra memory usage
    // no extra function call
    return (a > b) ? a : b; // this is the body
}
int main()
{
    int a = 2;
    int b = 5;
    int ans = 0;
    ans = getMax(a, b);
    cout << ans << endl;
    a = a + 3;
    b = b + 1;
    ans = getMax(a, b);
    cout << ans << endl;
    return 0;
}

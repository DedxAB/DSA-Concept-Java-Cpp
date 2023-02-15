#include <iostream>
using namespace std;

int& fun(int n){
    int num = n;
    int& ans = num;
    return ans;
}
void update(int a)
{
    a++;
}
void update1(int &a)
{
    // reference variable
    a++;
}
int main()
{
    int a = 5;
    // update(a);
    cout << "Before " << a << endl;
    update1(a);
    cout << "After  " << a << endl;
    fun(a);
    return 0;
}

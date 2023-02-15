#include <iostream>
using namespace std;
int main()
{
    char ch = 'A';        // static memory using stack
    char *ptr = new char; // dynamic memory allocation using heap and heap only stores address not name of the variable
    // char *ptr stores in the stack and new char stores in the heap
    // here new char occupies 1 byte and char *ptr occupies 1 byte so total 2 byte

    /*
    char *ptr1 = &ch;
    cout << sizeof(ptr1) << endl;
    cout << sizeof(ch) << endl;
    */

    int a = 7;
    char ch1 = 'B';
    float b = 6.8;
    int *ptr2;
    cout << sizeof(a) << endl;
    cout << sizeof(ch1) << endl;
    cout << sizeof(b) << endl;
    cout << sizeof(ptr2) << endl;
    return 0;
}

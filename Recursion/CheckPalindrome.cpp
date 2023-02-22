#include <iostream>
using namespace std;

bool checkPal(string arr, int i, int j)
{
    if (i > j)
        return true;
    if (arr[i] != arr[j])
        return false;
    else
    {
        return checkPal(arr, i + 1, j - 1);
    }
}

int main()
{
    string arr = "arnra";
    bool chkPal = checkPal(arr, 0, arr.length() - 1);
    if (chkPal)
        cout << "palindrome" << endl;
    else
        cout << "Not palindrome" << endl;
    return 0;
}

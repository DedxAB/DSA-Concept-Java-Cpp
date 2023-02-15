#include <iostream>
using namespace std;
int getSum(int *arr, int size)
{
    int sum = 0;
    for (int i = 0; i < size; i++)
    {
        sum += arr[i];
    }
    return sum;
}
int main()
{
    int arr1[5]; // static way to declare an array
    // --> takes 5x4 = 20 byte
    int *ptr = new int[5]; // dynamic way to declare an array
    // --> takes 5x4 = 20 + 4(for 32-bit system) = 24 bytes

    // lets take an example of an array
    int n;
    cin >> n;
    // variable size array
    int *arr = new int[n];
    // taking input of an array
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int sum = getSum(arr, n);
    cout << "sum = " << sum << endl;

    // Good Question difference between below two while loop
    while (true)
    {
        int m = 5; // at a time 4 byte is allocated
    }
    // another one
    while (true)
    {
        int *n = new int; // 1st 4 byte then 4 byte and so on addition
    }

    return 0;
}

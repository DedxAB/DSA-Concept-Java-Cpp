#include <iostream>
using namespace std;

void printArray(int arr[], int size, int start = 0)
{
    // here in the function signature, int start = 0 is the default argument
    // and start from right most parameter
    // like this --> (int arr[], int size = 0, int start) not possible
    // right to left way
    for (int i = start; i < size; i++)
    {
        cout << arr[i] << endl;
    }
}
int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    int size = 5;
    printArray(arr, size);
    return 0;
}

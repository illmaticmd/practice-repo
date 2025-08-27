#include <iostream>
using namespace std;

int main() {
 int arr[2][3][3] = 
    { 
        { {0,1,2}, {2,3,4}, {6,7,1} }, 
        { {6,7, 1}, {8,9, 2}, {9,14, 22} } 
    }; 

    // accessing a single value i.e 0
    cout << arr[0][0][0] << endl;
  
    // output each element's value by iterating through the array 
    for (int i = 0; i < 2; ++i) 
    { 
        for (int j = 0; j < 3; ++j) 
        { 
            for (int k = 0; k < 3; ++k) 
            {              
                cout << "Element at arr[" << i << "][" << j 
                     << "][" << k << "] = " << arr[i][j][k] 
                     << endl;
       
            } 
        }     
    } 
    return 0; 
}  

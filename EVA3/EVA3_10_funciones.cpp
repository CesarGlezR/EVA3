#include <iostream>

using namespace std;


int potencia(int iVal, int iPotencia){
    int iNo = iVal;
    for(int i = iPotencia; i >= 2; i--){
        iVal *=iNo;
    }
    return iVal;
}

int main()
{
    cout<<"introduce un numero";
    int iVal;
    cin>> iVal;
    cout<<"introduce una potencia";
    int iP;
    cin>> iP;
    cout<<"Resultado=" <<potencia(iVal, iP);

    return 0;
}
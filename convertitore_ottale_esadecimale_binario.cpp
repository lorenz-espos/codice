//
//  main.cpp
//  convertitore_v1.2
//
//  Created by Lorenzo Esposito on 16/10/2020.
//
#include <iostream>
using namespace std;

int main() {
    int n=0;
    int a=2;
    string b;
    b="";
    cout<<"********************************CONVERTITORE********************************"<<endl;
    cout << "ciao sono il tuo convertitore"<<endl;
    while (a!=0){
        cout<<"inserisci il numero che intendi convertire"<<endl;
        cin>>n;
        cout<<"esadecimale: "<<hex << n <<endl;
        cout<<"ottale: "<<oct << n <<endl;
        while (n>0) {
                if (n%2==0)
                    b='0'+b;
                else
                    b='1'+b;
                n=n/2;
            }

           cout<<"binario "<<b<<endl;
               
    
        cout<<"*********************************************************************"<<endl;
        system( "read -n 1 -s -p \"PREMI UN QUALSIASI TASTO PER CONTINUARE...\"" );
        system("clear");
    }
    return 0;
}

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
    cout<<"********************************CONVERTITORE********************************"<<endl;
    cout << "ciao sono il tuo convertitore"<<endl;
    while (a!=0){
        cout<<"inserisci il numero in base 10 che intendi convertire"<<endl;
        cin>>n;
        cout<<"esadecimale: "<<hex << n <<endl;
        cout<<"ottale: "<<oct << n <<endl;
        cout<<"binario "<<bitset<8>(n)<<endl;
               
    
        cout<<"*********************************************************************"<<endl;
        system( "read -n 1 -s -p \"PREMI UN QUALSIASI TASTO PER CONTINUARE...\"" );
        system("clear");
    }
    return 0;
}

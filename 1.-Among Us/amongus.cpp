#include<iostream>
using namespace std;

int main(){
int n,m;
cin>>n;
int b[n+1];
for(int i=0; i<=n; i++){
    b[i]=0;
}
for(int i=0; i<n; i++){
    cin>>m;
    b[m]++;
}

int mayor=0;
int indice;
bool empate=false;
for(int i=1; i<=n; i++){
    if(b[i]>mayor){
        mayor=b[i];
        indice=i;
    }
}
for(int i=1; i<=n; i++){
    if(indice!=i){
        if(b[i]==mayor){
            empate=true;
        }
    }
}
if(empate) cout<<"Nadie fue expulsado";
else cout<<"#"<<indice<<" fue expulsado";

return 0;
}
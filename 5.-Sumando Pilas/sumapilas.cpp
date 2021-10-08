#include<bits/stdc++.h>
using namespace std;

int main(){

stack<int> p;
int n;
int n1;
int n2;
int num;
cin>>n;
string operacion;
while(n--){
    cin>>operacion;
    if(operacion=="AGREGA"){
        cin>>num;
        p.push(num);
    }
    if(operacion=="CONSUME"){
        n1=p.top();
        p.pop();
        n2=p.top();
        p.pop();
        p.push(n1+n2);
    }
    if(operacion=="IMPRIME"){
        cout<<p.top()<<"\n";
    }
}

return 0;
}
#include<bits/stdc++.h>
using namespace std;

int main(){

stack<string> p;
string operacion;
while(cin>>operacion && operacion!="#"){
    p.push(operacion);
}
while(!p.empty()){
    cout<<p.top()<<"\n";
    p.pop();
}
return 0;
}
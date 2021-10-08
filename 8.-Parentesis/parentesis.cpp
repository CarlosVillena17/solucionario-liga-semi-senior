#include<bits/stdc++.h>
using namespace std;

int main(){

stack<char> p;
string str;
cin>>str;
for(int i=0; i<str.size(); i++){
    if(p.empty()) {
        p.push(str[i]);
    }else if(p.top()=='(' && str[i]==')'){
        p.pop();
    }else{
        p.push(str[i]);
    }
}

if(p.empty()) cout<<"SI";
else cout<<"NO";
return 0;
}
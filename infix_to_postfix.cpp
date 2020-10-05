#include<iostream>
using namespace std;

class Stack
{
  public:
  int size;
  int Top;
  char *arry;
};

char isOperand(char c)
{
  if(c=='+' || c=='-' || c=='*' || c=='/')
  {
    return 0;
  }
  else
  {
    return 1;
  }
  
}

int precedence(char s)
{
  if(s=='+' || s=='-')
  {
    return 1;
  }
  else if(s=='*' || s=='/')
  {
    return 2;
  }
  return 0;
}

char stack_top(Stack sta)
{
  if(sta.Top==-1)
  {
    return -1;
  }
  return sta.arry[sta.Top];
}

void push(Stack *sta,char x)
{
  if(sta->Top==sta->size)
  {
    cout<<"Stack is Full"<<endl;
  }
  else
  {
    sta->Top++;
    sta->arry[sta->Top]=x;
  }
}

char pop(Stack *sta)
{
  char str;
  if(sta->Top==-1)
  {
    cout<<"Stack is in Underflow"<<endl;
  }
  else
  {
    str=sta->arry[sta->Top];
    sta->Top--;
  }
  return str;
}

int isEmpty(Stack sta)
{
  if(sta.Top==-1)
  {
    return 1;
  }
  else
  {
    return 0;
  }
  
}
int str_length(string str)
{
  int count=0;
    for(int i=0;str[i]!='\0';i++)
    {
        count++;
    }
    return count;
}

char *change_to_post(string str)
{
  Stack st;
  st.size=str_length(str);
  st.Top=-1;
  st.arry=new char[st.size];

  char * postfix=new char[str_length(str)+1];
  int i=0;
  int j=0;

  while(str[i]!='\0')
  {
    if(isOperand(str[i]))
    {
      postfix[j++]=str[i++];
    }
    else
    {
      if(precedence(str[i])>precedence(stack_top(st)))
      {
        push(&st,str[i++]);
      }
      else
      {
        postfix[j++]=pop(&st);
      }
   }
  }
  while(!isEmpty(st))
  {
    postfix[j++]=pop(&st);
  }
  postfix[j]='\0';
  
  return postfix;
}


int main()
{
    string infix;
    cout<<"Enter the Complete expression for the infix >>"<<endl;
    getline(cin,infix);
    char *postfix;   
    //cout<<infix<<" "<<count;
    
    cout<<"infix equation: "<<infix<<endl;
    cout<<"Change to Postfix !!"<<endl;
    postfix=change_to_post(infix);
    cout<<"postfix equation: "<<postfix<<endl;
}

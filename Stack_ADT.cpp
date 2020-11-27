#include<iostream>
using namespace std;

class Stack
{
    public:
    int size;
    int Top;
    int *arry;
};

void push(Stack *st,int no)
{
    if(st->Top==st->size)
    {
        cout<<"Stack is overflow(full).."<<endl;
    }
    else
    {
        st->Top++;
        st->arry[st->Top]=no;
    }
    
}

int pop(Stack *st)
{
    int x=-1;
    if(st->Top==-1)
    {
        cout<<"Stack is Underflow(empty)!!";
    }
    else
    {
        x=st->arry[st->Top];
        st->Top--;
    }
    return x;
    
}

int peek(Stack st,int pos)
{
    int x=-1;
  if(st.Top-pos+1<0)
  {
      cout<<"Invalid Position !!";
  }
  else
  {
      x=st.arry[st.Top-pos+1];
  }
  return x;
}

int Stack_Top(Stack st)
{
    if(st.Top==-1)
    {
        return -1;
    }
    else
    {
        return st.arry[st.Top];
    }
}

int isEmpty(Stack st)
{
    if(st.Top==-1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int isFull(Stack st)
{
    if(st.Top==-1)
    {
        return 0;
    }
    else
    {
        return 1;
    }
}

int main()
{
    Stack st;
    cout<<"Enter the Size of the Stacke: ";
    cin>>st.size;
    st.arry=new int(st.size);
    st.Top=-1;
    
    int choice;
    do
    {
    cout<<"1. Wants To Add Elements to Stack(Push)!"<<endl<<"2. Wants Delete the The Element(as we know from top only)(pop)!!"<<endl;
    cout<<"3. Wants to See the Which element is present at the given Position(Peek)!!"<<endl;
    cout<<"4. Wants to see which element are present at the top(Stack_top)"<<endl;
    cout<<"5. Lets See the Stack is Full ?"<<endl;
    cout<<"6. Exit !!"<<endl;
    cin>>choice;
       switch (choice)
       {
       case 1:
       {
        int n;
        cout<<"How many Element You Wants to push in Stack? ";
        cin>>n;
        for(int i=0;i<n;i++)
        {   
            int num;
            cout<<"Enter the Element: ";
            cin>>num;
            push(&st,num);
        }
         break;      
       }
       case 2:
       {
         cout<<"Lets Pop the value !!(When this pop function will return the -1 then the Stack will be empty)"<<endl;
         cout<<pop(&st);
         break;
       }
       case 3:
       {
          cout<<"Enter the Position to see the element which are present there !!";
          int position;
          cin>>position;
          cout<<"If this Function Will Give -1 then its mean that no value is present at that position !!"<<peek(st,position)<<endl; 
          break;
       }
       case 4:
       {
           cout<<"In this You will either get the -1 which means no elements are present baki nahi toh wo value show kar dega !!"<<Stack_Top(st)<<endl;
           break;
       }
       case 5:
       {
           cout<<"If it returns 1(Full) or 0(Empty)"<<isFull(st);
           break;
       }
       case 6:break;

       default:
              cout<<"Enter the Correct Keyword !!"<<endl;
          
       }
    }
    while(choice!=6);
}

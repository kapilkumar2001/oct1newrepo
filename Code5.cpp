// ptrvoid.cpp
// pointers to type void
#include <iostream>
using namespace std;

int main()
   {
   int intvar=5;                //integer variable
   float flovar=6.94;              //float variable

   int* ptrint;               //define pointer to int
   float* ptrflo;             //define pointer to float
   void* ptrvoid;             //define pointer to void

   ptrint = &intvar;          //ok, int* to int*
  // ptrint = &flovar;          //error, float* to int*
// ptrflo = &intvar;          //error, int* to float*
   ptrflo = &flovar;          //ok, float* to float*

   ptrvoid = ptrint;         //ok, int* to void*
   //ptrint=ptrvoid;
   ptrint = static_cast<int*>(ptrvoid);
   cout<<"\nInteger:"<<*ptrint;
   cout<<"\nInteger:"<<*(static_cast<int*>(ptrvoid));
   ptrvoid = &flovar;         //ok, float* to void*
   //ptrflo=ptrvoid;
   //ptrflo= static_cast<float*>(ptrvoid);
   cout<<"\nFloat:"<<*ptrflo;
   return 0;
   }

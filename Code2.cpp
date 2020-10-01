#include<iostream>
using namespace std;

class widgetParts
{
	private:
		int modelNo;
		int partNo;
		float cost;
	
	public:
		void setPartData(int mNo, int pNo, float price)
		{
			modelNo=mNo;
			partNo=pNo;
			cost=price;
		}
		void getPartData()
		{
			cout<<"\nModel No.="<<modelNo;
			cout<<"\tPart No.="<<partNo;
			cout<<"\tCost=INR "<<cost;
		}
};

int main()
{
	widgetParts w1, w2;
	
	//w1.cost=255.79;
	w1.setPartData(2, 5, 255.79);
	w2.setPartData(4, 3, 569.45);
	
	w1.getPartData();
	w2.getPartData();
	
	return 0;
}

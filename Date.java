package Java;

import java.util.Scanner;

class Date {
	
	final int arr[] ={31,28,31,30,31,30,31,31,30,31,30,31};
	int dd,mm,yyyy;
	
	Date (int dd,int mm,int yyyy) {
		
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	
	int getNumberOfLeapYear() {
		
		if(mm>2) {
			return yyyy/4-yyyy/100+yyyy/400;
		}else {
		    return (yyyy-1)/4-(yyyy-1)/100+(yyyy-1)/400;
	}
	}
	int getNumberOfDays()
	{
int dCount=yyyy*365+getNumberOfLeapYear()+dd;


for(int i=0;i<mm-1;i++) {
	dCount+=arr[i];
}

return dCount;
	}
	int difference (Date d1,Date d2) {
		
		int dy1=d1.getNumberOfDays();
		int dy2=d2.getNumberOfDays();
		
		if(dy1>dy2)
			return dy1-dy2;
		else
			return dy2-dy1;
		
	}
	
	public String toString() {
		return dd+":"+mm+":"+yyyy+"";
	}
	static Date readDate() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter dd:");
		int dd=sc.nextInt();
		
		System.out.println("Enter mm:");
		int mm=sc.nextInt();
		
		System.out.println("Enter yyyy:");
		int yy=sc.nextInt();
		
		return new Date(dd,mm,yy);
	}
	
	public static void main(String[]args) {
		
		Date date1=readDate();
		Date date2=readDate();
		
		System.out.println("Number of Days between"+date1+" And "+date2+"is: "+date1.difference(date1,date2));
	}

}
	
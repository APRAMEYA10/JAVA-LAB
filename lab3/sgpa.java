import java.util.Scanner;
class Stud_details{
	
	int marks[]=new int[8];
	int cred[]= new int[8];
	String name,usn;
	double sgpa;
	Scanner sc =new Scanner(System.in);


	void getdetails(){
		System.out.println("Enter the USN");
		usn=sc.next();
		System.out.println("Enter the name");
		name=sc.next();
		for(int i=0;i<8;i++){
			System.out.println("Enter the mark");
			marks[i]=sc.nextInt();
			System.out.println("Enter the credit");
			cred[i]=sc.nextInt();
}
}

void display(){

	

	System.out.println("usn"+" "+usn);
	System.out.println("name"+" "+name);
		
	
	System.out.println("SGPA is"+this.sgpa);


}

void calcSGPA(){
	int sum=0;
	int grdpoint=0;

	int x; 
	for(int i=0;i<8;i++){
		
		
		
		x=marks[i]/10;
		switch(x){

			case 10: grdpoint=10;break;
			case 9:
			case 8:
			case 7:
			case 6:
			case 5:
			case 4: grdpoint=x+1;break;
			case 3:
			case 2:
			case 1:System.out.println("Fail");break;
			}
		sum=sum+ (grdpoint*cred[i]);		
}
	System.out.println(sum);
	this.sgpa=sum/20.0;

}
}


class Student{
	public static void main(String args[]){
		Stud_details s1[]=new Stud_details[3];
		for(int j=0;j<3;j++){
			s1[j]=new Stud_details();	}
		for(int j=0;j<3;j++){
			System.out.println("Enter the details of "+(j+1)+" Student");
			s1[j].getdetails();
			s1[j].calcSGPA();
System.out.println("Aprameya 1BM23CS048");

}
for(int j=0;j<3;j++){
	s1[j].display();
}
		
}

}

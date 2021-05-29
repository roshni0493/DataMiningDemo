package Abstractclass;

public class SubClass extends AbstractlassEx2 {
	 int x,y,z;
	 void get (int a,int b) {
		 x=a;
		 y=b;
	 }
 void add() {
	 z=x+y;
 }
 void display() {
	 System.out.println("The Addition is:"+z);
 }
}
 
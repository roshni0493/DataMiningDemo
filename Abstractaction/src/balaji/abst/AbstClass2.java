package balaji.abst;

public class AbstClass2 extends AbstClass {
	 String name;
	 
	 void getVal(String name) {
		 this.name=name;
	 }
void display() {
	System.out.println( "Hello" +" "+name);
}
}

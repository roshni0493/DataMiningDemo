package Abstractclass;

public class SubClassEx extends AbstClass {
	String name,gender ,city,country;
	void getName(String name) {
		
		this.name=name;
	}
	void getGender(String gender) {
		this.gender=gender;
	}
	void getCity(String city) {
		this.city="city";
	}
	void getCountry(String country) {
		this.country=country;
	}
	void display() {
		System.out.println("Name:"+name);
		//System.out.println("Sex:"+sex);
		System.out.println("Country:"+country);
		System.out.println("City:"+city);
	}

}

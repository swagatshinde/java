package Slip1;
class cont{
	String cont_name;
	cont(String cont_name)
	{
		this.cont_name=cont_name;
	}
}
class Country extends cont{
     String c_name;
	Country(String cont_name,String c_name ) {
		super(cont_name);
		this.c_name=c_name;
		// TODO Auto-generated constructor stub
	}
	
}
class State extends Country{
String state_name;
String place;
	State(String cont_name, String c_name,String State,String place) {
		super(cont_name, c_name);
		this.state_name=state_name;
		this.place=place;
		// TODO Auto-generated constructor stub
	}
	
	
}

public class Slip5_1 {

	public static void main(String[] args) {
		
		State s=new State("Asia","India","Maharastra","Loni");
		System.out.println("Continent: "+s.cont_name+"\nCountry :"+s.c_name+"\n State :"+s.state_name+"\n Place :"+s.place);

	}

}

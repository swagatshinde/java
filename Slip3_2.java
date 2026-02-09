package Slip1;

import java.util.Scanner;

class CovidPositiveException extends Exception{
	CovidPositiveException(String msg){
		super(msg);
	}
}
class Patient {
	String pname;
	int p_age;
	int oxlevel;
	int HRTC;
	Patient(String pname,int p_age,int oxlevel,int HRTC){
		this.pname=pname;
		this.p_age=p_age;
		this.oxlevel=oxlevel;
		this.HRTC=HRTC;
	}
	
}
public class Slip3_2 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter pname");
	String pname=sc.next();
	System.out.println("enter p_age");
	int p_age=sc.nextInt();
	System.out.println("enter oxlevel");
	int oxlevel=sc.nextInt();
	System.out.println("enter HRTC report");
	int HRTC=sc.nextInt();
	Patient p=new Patient(pname,p_age,oxlevel,HRTC);
	try {
		if(p.oxlevel<95 && p.HRTC>10)
		{
			throw new CovidPositiveException("Patient is covid positiove need to be hospitalized");
		}
		else
			display(p);
		
		
			
	}catch(CovidPositiveException e)
	{
		System.out.println(e.getMessage());
		
	}
}

	
	
	

static void display(Patient p) {
	System.out.println("patient name :"+p.pname+"\n"+"patient Age :"+p.p_age+"\n"+"Patient Oxylevel :"+p.oxlevel+"\n Patient HRTC :"+p.HRTC);
}
}

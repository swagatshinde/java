package student;

import java.util.Scanner;

interface Operation{
	void volume();
	float PI= 3.14f;
	
}
public class Slip11_1 implements Operation {

	public static void main(String[] args) {
	Slip11_1 c=new Slip11_1();
	c.volume();
	}

	@Override
	public void volume() {
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter radis and height");
		  float r=sc.nextFloat();
		  float h=sc.nextFloat();
		  System.out.println(" Volume :"+(4/3)*PI*r*r);
		
	}

}

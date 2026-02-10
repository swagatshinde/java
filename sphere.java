import java.util.Scanner;

class Sphere{
	float r,h;
	Sphere(float r,float h)
	{
		this.r=r;
		this.h=h;
	}
	void area()
	{
		System.out.println("Surface area :"+(4*3.14*r*r));
	}
	void volume()
	{
		System.out.println("Volume :"+((4/3)*3.14*r*r*r));
	}
}
public class sphere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        float r=sc.nextFloat();
        System.out.println("enter height");
        float h=sc.nextFloat();
        Sphere s=new Sphere(r,h);
        s.area();
        s.volume();
	}

}



import java.util.*;

class AreaOfCircle{
	public static void main(String ar[])
	{
		float a,r;
		System.out.println("Enter the value of radius: ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextFloat();
		a = 3.14f * r *r;
		System.out.println("Area of circle : "+ " " +a);
}
}
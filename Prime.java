package week1.day2;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 34343;
boolean type=false;
for (int i=2; i<=num/2;i++) 
{
	if (num % i==0)
	{
		type=true;
		
	}
}
	if (type)
		System.out.println(num + " is a not prime number");
	else
		System.out.println(num +" is a prime number");
	}

}

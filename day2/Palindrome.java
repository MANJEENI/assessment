package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=34343;
int temp = 0, rev;
int num = a;
for (a=34343;a>0;a=a/10)
{
	rev=a%10;
	temp = temp*10+rev;
}
if (num==temp)
{
	System.out.println(num +  " is a palindrome");}

	else
	{
	System.out.println(num + "  is not a palindrome");
	}
	}
}


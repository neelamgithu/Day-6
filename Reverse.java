import java.util.Scanner;
class day6_4{
public static void main(String []args){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number to reverse ");
	int num=sc.nextInt();
	int reverse=0;
	while(num!=0)
	{
		int reminder=num%10;
		 reverse=reverse*10+reminder;
		num=num/10;
		System.out.println(reverse);
	}
	
}}
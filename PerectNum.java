import java.util.Scanner;
class day6_2{
public static void main(String [] args){
	int sum=0;
Scanner sc= new Scanner(System.in);
System.out.print("enter number to ccheck perect"); 
int num=sc.nextInt();


int i=1;
while(i<=num/2)
{if(num%i==0)
{
sum=sum+i;
}
i++;
}
if( sum==num)  
{  
 
System.out.println(num+" is a perfect number.");  
} 
else  

System.out.println(num+" is not a perfect number.");   
 
}  
}
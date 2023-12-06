import java.util.Scanner;
class day6_1{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.print("enter tream  or last number");
int term=sc.nextInt();
int a=0;
int b=1;
int c;
for(int i =0;i<term;i++)
{
System.out.print(a + " ");
c=a+b;
a=b;
b=c;

}


}


}
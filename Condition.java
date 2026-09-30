public class Condition
{

public static void main(String[] args)
{

int a = 7;

if(a>0)
System.out.println("Positive Number!");

else if(a<0)
{
System.out.println("Negative Number!");
}

else
System.out.println("Non-negative Number (zero)!");


int b = 2; 

switch (b){
case 1: System.out.println("Saturday"); break;
case 2: System.out.println("Sunday"); break;
case 3: System.out.println("Monday"); break;
default: System.out.println("Any other day.");
}

}

}
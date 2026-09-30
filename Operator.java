public class Operator
{

public static void main(String[] args)
{

int a = 10, b = 5;

System.out.println("Using arithmetic operator: a+b = " +(a+b));

System.out.println("Using relational operator: a<b?: " +(a<b));

Boolean x = true, y = false;
System.out.println("Using logical operator: x||y: " +(x||y));

a += 5;
System.out.println("Using Assignment operator: a after +5: " +a);

++a;
System.out.println("Using Unary Operator: a after ++a: " +a);

int max = (a>b)?a:b;
System.out.println("Using Ternary Operator: Maximum value: " +max);

}

}
public class Vars
{

int ins = 10;
static String str = "Hello world";

public void amethod()
{
int local = 100;

System.out.println("Local Variable: " +local);
System.out.println("Instance Variable: " +ins);
System.out.println("Static Variable: " +str);
}

public static void main(String[] args)
{
Vars insideMain = new Vars();
insideMain.amethod();
System.out.println();
System.out.println("Calling Static and Instance variable inside Main: ");
System.out.println("Instance Variable: " +insideMain.ins);
System.out.println("Static Variable: " +str);

}

}
public class DataTypes{

public static void main(String[] args){

byte b = 40;
short s = 3556;
int i = 15047;
long l = 100008199L;

float f = 3.14f;
double d = 3.141599876;

char c = 'J';
Boolean bl = false;

String str = "Hello, Java";
int[] arr = {1, 2, 3, 4, 5};

Integer wrapperCls = Integer.valueOf(456);
StringBuilder strb = new StringBuilder("Java");

System.out.println("Byte: " +b);
System.out.println("Short: " +s);
System.out.println("Integer: " +i);
System.out.println("Long: " +l);
System.out.println("Float: " +f);
System.out.println("Double: " +d);
System.out.println("Character: " +c);
System.out.println("Boolean: " +b);
System.out.println("String: " +str);
System.out.println("Array: ");
for(int num: arr)
{
System.out.println(num + " ");
}

System.out.println("Wrapper Integer: " +wrapperCls);
System.out.println("StringBuilder: " +strb);

}

}
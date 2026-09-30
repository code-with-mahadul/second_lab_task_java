public class Loop
{

public static void main(String[] args)
{

System.out.println("Using For loop: ");
for(int i = 1; i<=5; i++)
System.out.println(i);

System.out.println("Using While loop: ");
int j = 1;
while(j<=5)
{
System.out.println(j);
j++;
}

int k = 1;

System.out.println("Using Do-while loop: ");
do
{
System.out.println(k);
k++;
}while(k<=5);

System.out.println("Using Enhanced For loop (for-each loop): ");
int[] array = {4, 3, 5, 2, 6};
for(int num : array)
System.out.println(num);

}

}
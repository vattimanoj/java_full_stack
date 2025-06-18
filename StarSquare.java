/*import java.util.Scanner;
public class StarSquare{
public static void main(String[] args){
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");

n=s.nextInt();
for (int i=0;i<n;i++)
{
for( int j=0;j<n;j++)
{
System.out.print("*");
}
System.out.println();
}}}*/

/*import java.util.Scanner;
public class NumberSquare{
public static void main (String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");

n=s.nextInt();
for (int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.print(i);
}
System.out.println();
}}}*/

/*import java.util.Scanner;
public class NumberSeqence{
public static void main (String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");

n=s.nextInt();
for (int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.print(j);
}
System.out.println();
}}}*/

/*import java.util.Scanner;
public class Numbers{
public static void main (String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");

n=s.nextInt();
for (int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.print(k++ +"\t");
}
System.out.println();
}}}*/

/*import java.util.Scanner;
public class Pattern{
public static void main (String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");
n=s.nextInt();
for (int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if (k==10){
k=1;
}
System.out.print(k++ +"\t");

}
System.out.println();
}}}*/

/*import java.util.Scanner;
public class Pattern1{
public static void main (String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");
n=s.nextInt();
for (int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
{
System.out.print(k +"\t");
k+=2;
}


}
System.out.println();
}}}*/

/*import java.util.Scanner;
public class Pattern2{
public static void main (String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");
n=s.nextInt();
for (int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
{
System.out.print(j%2);

}


}
System.out.println();
}}}*/

/*import java.util.Scanner;
 class Pattern3
 {
public static void main (String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");
n=s.nextInt();
for (int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for (int k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}}}*/

/*import java.util.Scanner;
 class Pattern4
 {
public static void main (String[] args)
{
int n,even=2;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");
n=s.nextInt();
for (int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for (int k=1;k<=i;k++)
{
System.out.print(" "+even);
even+=2;
}
System.out.println();
even=2;
}}}*/

/*import java.util.Scanner;
 class Pattern5
 {
public static void main (String[] args)
{
int n;
String q="INDIA";
Scanner s=new Scanner(System.in);
System.out.println("enter a value");
n=s.nextInt();
for (int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(q.charAt(j));
}
System.out.println();

}}}*/


/*import java.util.Scanner;
 class Pattern6
 {
public static void main (String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");
n=s.nextInt();
for (int i=1;i<=n;i++)
{
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for (int k=1;k<=2*i-1;k++)
{
System.out.print(" *");
}
System.out.println();
}}}*/


import java.util.Scanner;
 class Pattern7
 {
public static void main (String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");
n=s.nextInt();
for (int i=1;i<=n;i++)
{
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for (int k=1;k<=2*i-1;k++)
{
System.out.print(" *");
}
for (int l=n;l>=1;l++)
{
for(int m=i;m<=2*n-m;m++)
{
System.out.print(" ");
}
for (int o=1;o<=2*l-1;o++)
{
System.out.print(" *");
}
System.out.println();
}
System.out.println();
}}}

























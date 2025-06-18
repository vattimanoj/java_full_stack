/*import java.util.Scanner;
class Loop1{
public static void main(String[] args){
for(int i=0;i<=20;i++){
System.out.println("Bright IT carrer");
}}}*/

/*import java.util.Scanner;
class Loop2{
public static void main(String[] args){
int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}}}*/

/*import java.util.Scanner;
class Loop3{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("enter a value");

int a= s.nextInt();
System.out.println("enter a value");

int b=s.nextInt();
if(a==b){
System.out.println("both are equal");
}
else if(a!=b){
System.out.println("both are  not equal");
}}}*/

/*import java.util.Scanner;
class Loop4{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("enter a value");

int a= s.nextInt();
if(a%2==0){
System.out.println("even");
}
else {
System.out.println("odd");
}}}*/

/*import java.util.Scanner;
class Loop5{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("enter a value");

int a= s.nextInt();
System.out.println("enter a value");

int b= s.nextInt();
System.out.println("enter a value");

int c= s.nextInt();

if(a>b && a>c){
System.out.println("a is large");
}
else if(b>c) {
System.out.println("b is large");

}
else{
System.out.println("c is large");

}
}}*/

/*import java.util.Scanner;
class Loop7{
public static void main(String[] args){
int i=1;
do{
System.out.println(i);
i++;
}
while(i<=20);
}}*/

/*import java.util.Scanner;
class Loop8{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int sum=0,rem=0;
System.out.println("enter n value");
int n= s.nextInt();
int a=n;
while(n>0){
rem=n%10;
sum+=Math.pow(rem,3);
n/=10;
}
if(a==sum){
System.out.println("armstorng");
}
else {
System.out.println("given number is not armstrondg");
}}}*/



/* class Loop6 {
public static void main(String args[]) {
int i=10;
while(i<=100) {
if(i%2==0) {
System.out.print(i+" ");
}
i++;
}
}
}*/
/*import java.util.Scanner;
class Loop9 {
public static void main(String[] args) {
int n,count=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number:");
n=s1.nextInt();
for(int i=1;i<=n;i++) 
{
if(n%i==0){
count+=1;
}
}
if(count==2) {
System.out.println("The given Number "+n+" is a prime Number");
}
else {
System.out.println("The given number "+n+"is a not prime number:");
}
}
}
*/

/*import java.util.Scanner;

class Loop10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        int temp = num, rev = 0;
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (num == rev)
            System.out.println(num + " is a Palindrome.");
        else
            System.out.println(num + " is NOT a Palindrome.");
    }
}*/
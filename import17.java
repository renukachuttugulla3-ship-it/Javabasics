//create a java application where we have one class it contains one non-static method parameter Boolean return string value a non-static method m2 having parameter string return double value then invoke both the methods under the main method by providing dynamic inputs
//note:-m1 method return value should be the parameter of m2 method

import java.util.Scanner;
class A
{
static Scanner sc=new Scanner(System.in);
String m1(Boolean a)
{
System.out.print(a);
String s=sc.next();
}
double m2(String b)
{
System.out.print(b);
double d=sc.nextDouble();
}
public static void main (String[]args)
{
A obj=new A();
String s=obj.m1(sc.nextBoolean());
System.out.print(obj.m2(s));//sop(obj.m2(obj.m1(sc.nextBoolean())));
}
}



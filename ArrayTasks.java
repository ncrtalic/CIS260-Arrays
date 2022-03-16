import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTasks {
public static void main(String[] args){
int[][] table;
ArrayList<MultiplicationOperation_1> history = new ArrayList<>();
int size, num1, num2;
Scanner input = new Scanner(System.in);
System.out.print("What is the maximum multiplicand you want to be able to use?\n");
  
size = input.nextInt();
table = new int[size+1][size+1];
/*multiplication table*/
for(int i=0;i<=size;i++)
for(int j=0;j<=size;j++)
table[i][j] = i * j;
  
    menu: while(true){
System.out.println("1) Multiply\n2) Show History\n0) Exit\n");
num1 = input.nextInt();
switch(num1){
case 1:
System.out.print("Enter the multiplicands\n");
System.out.print("Enter the first multiplicand: ");
num1 = input.nextInt();
while(num1 < 0 || num1 > size){
System.out.println("Entered number should be positive and below maximum multiplicand");
System.out.print("Enter the first multiplicand: ");
num1 = input.nextInt();
}
System.out.print("Enter the second multiplicand: ");
num2 = input.nextInt();
while(num2 < 0 || num2 > size){
System.out.println("Entered number should be positive and below maximum multiplicand");
System.out.print("Enter the second multiplicand: ");
num2 = input.nextInt();
}
int result = table[num1][num2];
System.out.println(String.format("\n%d x %d = %d",num1,num2,result));
history.add(new MultiplicationOperation_1(num1,num2,result));
break;
case 2:
System.out.println("Display history of multiplication operations: ");
System.out.println("==============================================");
for(MultiplicationOperation_1 op : history)
System.out.println(op);
    break;
case 0:
input.close();
break menu;
default:
System.out.print("Invalid Selection\n");
}
}
}
}

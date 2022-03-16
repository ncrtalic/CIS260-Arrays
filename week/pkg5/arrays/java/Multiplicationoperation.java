/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg5.arrays.java;

/**
 *
 * @author ncrta
 */

    class MultiplicationOperation{
  
private int num1, num2, result;

public MultiplicationOperation(int num1, int num2, int result) {
this.num1 = num1;
this.num2 = num2;
this.result = result;
}

public int getNum1() {
return num1;
}

public int getNum2() {
return num2;
}

public int getResult() {
return result;
}

@Override
public String toString() {
return (String.format("%d x %d = %d", num1, num2, result));
}
}

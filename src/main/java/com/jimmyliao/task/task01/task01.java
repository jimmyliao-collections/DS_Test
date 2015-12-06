package com.jimmyliao.task.task01;

public class task01
{
  public static void main(String[] args){
    System.out.println("task01 - Fibonacci");
    int index = 0;
    while (true){
      System.out.println(fib(index));
      index++;

      //
      if(index==10)
      {
        break;
      }
    }

  }

  public static long fib(int i) {
    if (i == 0) return 0;
    if (i<= 2) return 1;

    long fibTerm = fib(i - 1) + fib(i - 2);
    return fibTerm;

  }

}

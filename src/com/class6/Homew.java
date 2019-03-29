package com.class6;

import java.util.Scanner;
class Homew {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    
    int month;
    String season;
    
    System.out.println("Please enter your birthday month number");
    month=scan.nextInt();
    
    switch (month) {
      
      case 12:
        season="Winter";
        break;
      case 1:
          season="Winter";
          break;
      case 2:
          season="Winter";
          break;
      case 3:
        season="Spring";
        break;
      case 4:
          season="Spring";
          break;
      case 5:
          season="Spring";
          break;
      case 6:
          season="Summer";
          break;
      case 7:
          season="Summer";
          break;
      case 8:
          season="Summer";
          break;
      case 9:
          season="Fall";
          break;
      case 10:
          season="Fall";
          break;
      case 11:
          season="Fall";
          break;
      default:
    	  season="Unknown";
          
    }
    System.out.println("You were born in "+season);
  }
}
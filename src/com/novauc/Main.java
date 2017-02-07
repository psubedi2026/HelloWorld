package com.novauc;

public class Main {

    public static void main(String[] args) {
	// write your code here
      int score = 0;

      System.out.println("Score is: " + score);

      score = score + 1;

      System.out.println("Score + 1 is: " + score);

      score += 1;

      System.out.println("Score + 1 is: " + score);


      double health = 100.0;

      System.out.println("health is: " + health);


      health = health * 0.75;

      System.out.println("health is: " + health);

      boolean didWin;

   //   System.out.println("didWin:  " + didWin);

      didWin =  score > 0;

      System.out.println("didWin: " + didWin);


      double[] position = {1.0, 1.5};

/*      position = new double[2];

      position[0] = 1.0;

      position[1] = 1.5;
*/

      System.out.println("position[0]: " + position[0]);
      System.out.println("position[1]: " + position[1]);

      Person me = new Person();

      me.name = "Prakash";
      me.age = 24;
      me.isAlive = true;

      Person president = new Person();

      president.name = "Donald Trump";
      president.age = 70;
      president.isAlive = true;


      System.out.println("President's name is: " +  president.name);
      System.out.println("age is: "  + me.age);
      System.out.println("isAlive: " + me.isAlive);

      me.setAge(25);
      me.setAge(225);
      me.setIsAlive(true);

      System.out.println("Me age: "  + me.getAge());
      System.out.println("Me isAlive: " + me.getIsAlive());




    }
}

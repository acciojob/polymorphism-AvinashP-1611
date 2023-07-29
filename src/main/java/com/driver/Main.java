package com.driver;

public class Main {
  public static class Product{
       public static void main(String[] args) {
           Product p=new Product();
           p.product(4,5);
           p.product(4,5,6);
           p.product(4.0d,5.0d);
       }
       public int product(int x, int y) {
            return 1;
       }
       public int product(int x, int y, int z) {
            return 2;
       }
       public double product(double x, double y) {
          return 1.1;
       }
   }
}
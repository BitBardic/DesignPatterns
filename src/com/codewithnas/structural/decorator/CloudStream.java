package com.codewithnas.structural.decorator;

public class CloudStream implements Stream {
   public void write(String data){
       System.out.println("Storing " + data);
   }
}

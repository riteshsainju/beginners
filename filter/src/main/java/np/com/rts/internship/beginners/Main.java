package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  ArrayList<Animal> originalList = new ArrayList<Animal>() {{
    add(new Animal("herbivore", "lamb", 4));
    add(new Animal("herbivore", "cow", 4));
    add(new Animal("herbivore", "giraffe", 4));
    add(new Animal("carnivore", "lion", 4));
    add(new Animal("carnivore", "bear", 4));
    add(new Animal("carnivore", "leopard", 4));
    add(new Animal("carnivore", "panther", 4));
    add(new Animal("omnivore", "human", 2));
  }};

  ArrayList<String> herbivores = new ArrayList<>();
  ArrayList<Animal> carnivores = new ArrayList<>();
  ArrayList<Animal> omnivores = new ArrayList<>();

  public Main() {
    // Write your code here
      for(Animal obj : originalList) {
          if(obj.getType() == "herbivore") {
              herbivores.add(obj);
          }

          for(Animal obj : originalList) {
              if (obj.getType() == "carnivore") {
                  carnivores.add(obj);
              }

              for (Animal obj : originalList) {
                  if (obj.getType() == "omnivore") {
                      omnivores.add(obj);

                  }
              }


          }

      public static void main(String[] args) { //error occured  illegal start of epression, I think other code is fine
          new Main();
      }
  }

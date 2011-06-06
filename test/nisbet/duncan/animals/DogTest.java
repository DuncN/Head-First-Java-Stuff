package nisbet.duncan.animals;

class DogTest{

public static void main (String[] args){
   Dog one = new Dog();
   one.setSize(70);
   Dog two = new Dog();
   two.setSize(8);
   Dog three = new Dog();
   three.setSize(99);
   
   System.out.println("Dog one: " + one.getSize());
   System.out.println("Dog two: " + two.getSize());
   System.out.println("Dog three: " + three.getSize());
   
   one.bark();
   two.bark();
   three.bark();
    }

}

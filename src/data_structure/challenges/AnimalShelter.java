package data_structure.challenges;

import java.util.LinkedList;

abstract class Animal {
    private int arrivalOrder;
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public int getArrivalOrder() {
        return arrivalOrder;
    }

    public void setArrivalOrder(int arrivalOrder) {
        this.arrivalOrder = arrivalOrder;
    }

    public boolean isOlderThan(Animal a){
        return this.arrivalOrder < a.getArrivalOrder();
    }

    public void printName(){
        System.out.println("I am "+name);
    }

}

// create Dog and Cat classes
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

public class AnimalShelter {

    // welcome to Animal World!
    // This is an Animal Shelter that holds only Dogs(Bhau... Bhau..) and Cats(Meow...).
    // This Animal Shelter operates on a strictly "first in, first out" basis.
    // People must adopt either the "oldest"(based on the arrival time) of all animals at the shelter,
    // or they can select whether they would prefer a dog or a cat(oldest animal of that type).
    // They can not select which specific animal they would like.
    // Create a data structures that manages this system implement operations such as enqueue, dequeueAny,
    // dequeueDog, dequeueCat.
    // let's start.(I have already seen the solution :))

    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal a){
        a.setArrivalOrder(order);
        order++;

        if (a instanceof Dog) dogs.addLast((Dog) a);
        else if (a instanceof Cat) cats.addLast((Cat) a);

    }

    public Animal dequeueAny(){
        if (dogs.size() == 0)
            return dequeueCat();
        else if (cats.size() == 0)
            return dequeueDog();

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThan(cat))
            return dequeueDog();
        else
            return dequeueCat();
    }

    public Dog dequeueDog(){
        return dogs.poll();
    }

    public Cat dequeueCat(){
        return cats.poll();
    }

    public static void main(String[] args) {

        AnimalShelter shelter = new AnimalShelter();

        Animal dog1 = new Dog("Trojans");
        Animal dog2 = new Dog("Suzy");
        Animal cat1 = new Cat("Pushy");
        Animal dog3 = new Dog("Sherlock");
        Animal cat2 = new Cat("Rocky");
        // enqueue
        shelter.enqueue(dog1);
        shelter.enqueue(dog2);
        shelter.enqueue(cat1);
        shelter.enqueue(dog3);
        shelter.enqueue(cat2);

        Animal adopt = shelter.dequeueAny();
        adopt.printName();
        adopt = shelter.dequeueCat();
        adopt.printName();
        adopt = shelter.dequeueDog();
        adopt.printName();
        adopt = shelter.dequeueCat();
        adopt.printName();


    }
}

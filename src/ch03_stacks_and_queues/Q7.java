package ch03_stacks_and_queues;

import java.util.LinkedList;

public class Q7 {
    public static class Animal {
        String name;
        String type;
        int added;

        Animal(String n, String t) {
            name = n;
            type = t;
        }
    }

    public static class AnimalShelter {
        private LinkedList<Animal> dogList;
        private LinkedList<Animal> catList;
        private int timeStamp;

        public AnimalShelter() {
            dogList = new LinkedList<>();
            catList = new LinkedList<>();
        }

        public void enqueue(Animal animal) {
            animal.added = timeStamp++;

            if (animal.type == "dog") {
                dogList.addLast(animal);
            } else if (animal.type == "cat") {
                catList.addLast(animal);
            }
        }

        public Animal dequeueDog() {
            return dogList.isEmpty() ? null : dogList.removeFirst();
        }

        public Animal dequeueCat() {
            return catList.isEmpty() ? null : catList.removeFirst();
        }

        public Animal dequeueAny() {
            Integer oldestDog = dogList.isEmpty() ? null : dogList.getFirst().added;
            Integer oldestCat = catList.isEmpty() ? null : catList.getFirst().added;

            // deal with the null cases
            if (oldestDog == null && oldestCat != null) {
                return catList.removeFirst();
            } else if (oldestCat == null && oldestDog != null) {
                return dogList.removeFirst();
            } else if (oldestCat == null && oldestDog == null) {
                return null;
            }

            // return the older animal
            if (oldestDog < oldestCat) {
                return dogList.removeFirst();
            } else {
                return catList.removeFirst();
            }
        }
    }
}

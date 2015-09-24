package ch11_sorting_and_searching;

import java.util.ArrayList;

public class Q7 {
    public static class Person {
        public int height;
        public int weight;

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        public boolean canBeAbove(Person p) {
            if (p == null)
                return true;

            if (this.height < p.height && this.weight < p.weight) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static ArrayList<Person> getBiggestStack(ArrayList<Person> people, Person bottom) {
        ArrayList<Person> maxStack = null;
        int maxLength = 0;

        for (Person p : people) {
            if (p.canBeAbove(bottom)) {
                ArrayList<Person> newStack = getBiggestStack(people, p);
                int length = newStack.size();

                if (length > maxLength) {
                    maxStack = newStack;
                    maxLength = length;
                }
            }
        }

        // base case, no one can stack on top
        if (maxStack == null) {
            maxStack = new ArrayList<>();
        }

        // add bottom to the stack
        if (bottom != null) {
            maxStack.add(bottom);
        }

        return maxStack;
    }

    public static ArrayList<Person> getBiggestStack(ArrayList<Person> people) {
        return getBiggestStack(people, null);
    }

}

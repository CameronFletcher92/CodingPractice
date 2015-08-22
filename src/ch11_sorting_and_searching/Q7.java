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
    }

    private static void partition(ArrayList<Person> people, int start, int end, int mid) {
        Person pivot = people.get(mid);

        while (start <= end) {
            // find the first elem left of the pivot that should be on the right of the pivot
            while (people.get(start).weight < pivot.weight && people.get(start).height < pivot.height) {
                start++;
            }

            // find the first elem on the right of the pivot that should be on the left of the pivot
            while (people.get(end).weight > pivot.weight && people.get(end).height > pivot.height) {
                end--;
            }

            // swap the elements and move left and right indices
            if (start <= end) {
                Person tmp = people.get(start);
                people.set(start, people.get(end));
                people.set(end, tmp);

                start++;
                end--;
            }
        }
    }

    private static void sortPeople(ArrayList<Person> people, int start, int end) {
        if (start > end) {
            return;
        }

        // partition around pivot
        int mid = (start + end) / 2;
        partition(people, start, end, mid);

        // recurse to smaller sub items
        sortPeople(people, start, mid - 1);

        // recurse to larger sub items
        sortPeople(people, mid + 1, end);
    }

    public static ArrayList<Person> getLongestTower(ArrayList<Person> people) {
        ArrayList<Person> result = new ArrayList<>();
        sortPeople(people, 0, people.size() - 1);

        // scan for duplicates
        for (int i = 0; i < people.size() - 1; i++) {
            Person p1 = people.get(i);
            Person p2 = people.get(i + 1);

            if (p1.height >= p2.height || p1.weight >= p2.weight) {
                people.remove(i + 1);
                i--;
            }
        }

        return people;
    }
}

package ch03_stacks_and_queues;
import junit.framework.TestCase;

public class Q7Test extends TestCase {

    public void testAnimalShelter() throws Exception {
        Q7.AnimalShelter shelter = new Q7.AnimalShelter();

        shelter.enqueue(new Q7.Animal("cat1", "cat"));
        shelter.enqueue(new Q7.Animal("dog1", "dog"));
        shelter.enqueue(new Q7.Animal("dog2", "dog"));
        shelter.enqueue(new Q7.Animal("dog3", "dog"));
        shelter.enqueue(new Q7.Animal("dog4", "dog"));
        shelter.enqueue(new Q7.Animal("cat2", "cat"));
        shelter.enqueue(new Q7.Animal("cat3", "cat"));

        assertEquals("cat1", shelter.dequeueAny().name);
        assertEquals("dog1", shelter.dequeueAny().name);
        assertEquals("dog2", shelter.dequeueAny().name);
        assertEquals("dog3", shelter.dequeueDog().name);
        assertEquals("cat2", shelter.dequeueCat().name);
        assertEquals("dog4", shelter.dequeueAny().name);
        assertEquals("cat3", shelter.dequeueAny().name);

        shelter.enqueue(new Q7.Animal("cat2", "cat"));
        shelter.enqueue(new Q7.Animal("cat3", "cat"));

        assertEquals("cat2", shelter.dequeueCat().name);
        assertEquals("cat3", shelter.dequeueAny().name);
    }

}
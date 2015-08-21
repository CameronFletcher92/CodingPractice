package ch11_sorting_and_searching;
import junit.framework.TestCase;

public class Q2Test extends TestCase {
    public void testSortAnagrams() throws Exception {
        String[] words = new String[] {
                "a", "llaann", "b", "lalann", "c", "abc", "cba", "lanlan", "banban", "bnabna"
        };

        Q2.sortAnagrams(words);
        assert(true);
    }

}
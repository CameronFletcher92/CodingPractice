package ch09_recursion_and_dynamic_programming;

import java.util.ArrayList;
import java.util.HashMap;

public class Q10 {
    public static class Box {
        public int width;
        public int height;
        public int depth;

        public boolean canBeAbove(Box box) {
            return box == null ||
                    (this.width < box.width
                    && this.depth < box.depth
                    && this.height < box.height);
        }

        public Box(int width, int depth, int height) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        public String toString() {
            return width + "x" + depth + "x" + height;
        }
    }

    private static int getStackHeight(ArrayList<Box> boxes) {
        int height = 0;
        for (Box box : boxes) {
            height += box.height;
        }

        return height;
    }

    public static ArrayList<Box> getTallestStack(ArrayList<Box> boxes, Box bottom, HashMap<Box, ArrayList<Box>> map) {
        if (bottom != null && map.containsKey(bottom)) {
            return (ArrayList<Box>)map.get(bottom).clone();
        }

        int height;
        int maxHeight = 0;
        ArrayList<Box> maxStack = null;

        for (Box box : boxes) {
            if (box.canBeAbove(bottom)) {
                ArrayList<Box> stack = getTallestStack(boxes, box, map);
                height = getStackHeight(stack);

                if (height > maxHeight) {
                    maxHeight = height;
                    maxStack = stack;
                }
            }
        }

        if (maxStack == null) {
            maxStack = new ArrayList<>();
        }

        if (bottom != null) {
            maxStack.add(0, bottom);
        }

        map.put(bottom, maxStack);

        return maxStack;

    }

    public static ArrayList<Box> getTallestStack(ArrayList<Box> boxes) {
        return getTallestStack(boxes, null, new HashMap<Box, ArrayList<Box>>());
    }
}

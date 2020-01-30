package ca.bcit.comp2522.labs.lab03;

import java.util.ArrayList;
import java.util.Random;

/**
 * Creates and manages a Plantation containing Trees.
 *
 * @author Chloe Glave
 * @version 2020
 */
public class Plantation {
    /**Minimum number of trees that can be planted when the farm is seeded.*/
    static final int MINIMUM_NUM_OF_TREES_TO_SEED = 10;

    /**Maximum number of trees that can be planted when the farm is seeded.*/
    static final int MAXIMUM_NUM_OF_TREES_TO_SEED = 10000;

    /**Minimum age of a tree planted when the farm is seeded.*/
    static final int MINIMUM_TREE_AGE = 0;

    /**Maximum age of a tree planted when the farm is seeded.*/
    static final int MAXIMUM_TREE_AGE = 1000;

    /**Minimum trunk circumference of a tree planted when the farm is seeded.*/
    static final double MINIMUM_TREE_CIRCUMFERENCE = 10.0;

    /**Maximum trunk circumference of a tree planted when the farm is seeded.*/
    static final double MAXIMUM_TREE_CIRCUMFERENCE = 100.0;

    private ArrayList<Tree> farm = new ArrayList<>();

    /**
     * Returns the current size of the farm; the number of trees there are.
     * @return the number of trees in the farm.
     */
    public int size() {
        return farm.size();
    }

    /**
     * Adds a tree to the farm.
     * @param sapling the new tree to be added.
     */
    public void add(Tree sapling) {
        if (sapling == null) {
            throw new NullPointerException("That sapling doesn't exist!");
        } else {
            farm.add(sapling);
        }
    }

    /**
     * Populates the farm with trees.
     * The number of trees planted will be random within the seed bound constants,
     * and each will have random instance variables.
     *
     * @return the number of trees added to the farm.
     */
    public int seed() {

    }

}
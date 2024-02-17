package org.kata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PrimeFactorsTest {

    @Test
    public void factors() {

        assertThat(factorsOf(1), is(empty()));
        assertThat(factorsOf(2),contains(2));


    }

    private List<Integer> factorsOf(int n) {

        ArrayList<Integer> factors = new ArrayList<>();
        if (n > 1){
            factors.add(2);
        }
        return factors;
    }

}

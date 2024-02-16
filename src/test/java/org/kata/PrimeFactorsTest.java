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


    }

    private List<String> factorsOf(int n) {
        return new ArrayList<>();
    }

}

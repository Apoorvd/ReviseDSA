package org.revise.binarysearchdsa;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    public void binarySearchTest()
    {
        var search = new BinarySearch();
        System.out.println("just a change");
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //List<Integer> list2 = new ArrayList<>(){{add(3);}};
        //List<String> list = Arrays.asList("foo", "bar");
        //List<String> list = Stream.of("foo", "bar")
        //      .collect(Collectors.toList());
        //List<String> list = List.of("foo", "bar", "baz");
        //Set<String> set = Set.of("foo", "bar", "baz");

        int testResult = search.binarySearch(list, 3);
        assertEquals(3, testResult+1);

        testResult = search.binarySearch(list, 11);
        assertEquals(-1, testResult);
    }
}
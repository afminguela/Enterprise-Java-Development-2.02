package org.example;

import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;


public class CreateTestTest {


    @BeforeAll
    public static void setUp() {
        System.out.println("test comienza ");

    }


    @AfterAll
    public static void tearDown() {
        System.out.println("test acaba");
    }

    @Test
    public void testOddEven() {
        CreateTest createTest = new CreateTest();
        List<Integer> expected = Arrays.asList(1, 3);
        Assertions.assertEquals(expected, createTest.oddEven(5));
    }

    @Test
    public void checkJavaKeywords() {
        CreateTest createTest = new CreateTest();
        Assertions.assertTrue(createTest.checkJavaKeywords("Don´t break my heart"));
        System.out.println("test pasado");

    }

}
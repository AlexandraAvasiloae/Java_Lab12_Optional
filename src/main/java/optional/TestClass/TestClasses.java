package compulsory.TestClass;


import compulsory.Test;

import java.util.List;

/**
 * Clasa de test
 */

@Test
public class TestClasses {
    @Test
    static int variabila_statica;
    @Test
    List<String> text;

    @Test
    public TestClasses(){

    }

    @Test
    public static void test2(int number){
        System.out.println("Apel test 2 - fara parametri");
    }
    @Test
    public static void test3(int number){
        System.out.println("Apel test 3 - cu parametri");
    }
}

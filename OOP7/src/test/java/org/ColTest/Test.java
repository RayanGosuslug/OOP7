package org.ColTest;

import org.BookCollection.MyCollection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class Test {
    private MyCollection<String> myCollection;

    @BeforeEach
    void setUp() {
        myCollection = new MyCollection<>();
    }

    @org.junit.jupiter.api.Test
    //тестирует добавление и получение индекса
    void AddAndGetTest(){
        myCollection.add(0, "firsDumIndex");
        myCollection.add(1, "TESTING");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("0"); expected.add("TESTING");
        Assertions.assertEquals(expected.get(1), myCollection.get(1));
    }

    @org.junit.jupiter.api.Test
    //удаление
    void DelTest(){
        myCollection.add(0, "firsDumIndex");
        myCollection.add(1, "TESTING");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("0"); expected.add("TESTING");
        expected.remove(0);
        myCollection.remove(0);
        Assertions.assertEquals(expected.get(0), myCollection.get(0));
    }

    @org.junit.jupiter.api.Test
    //размер
    void SizeTest(){
        myCollection.add(0, "firsDumIndex");
        myCollection.add(1, "TESTING");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("0"); expected.add("TESTING");
        Assertions.assertEquals(expected.size(), myCollection.size());
    }
}

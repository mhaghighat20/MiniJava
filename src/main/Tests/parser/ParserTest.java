package parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class ParserTest {
    Parser parser;
    @BeforeEach
    void setUp() {
        parser = new Parser();
    }

    @Test
    void test1() throws FileNotFoundException {
        ArrayList<String> actual = parser.startParse(new Scanner(new File("src/main/resources/test1.java")));
        ArrayList<String> expected = readExpected("src/main/resources/expected1.txt");

        assertIterableEquals(expected, actual);
    }

    @Test
    void test2() throws FileNotFoundException {
        ArrayList<String> actual = parser.startParse(new Scanner(new File("src/main/resources/test2.java")));
        ArrayList<String> expected = readExpected("src/main/resources/expected2.txt");

        assertIterableEquals(expected, actual);
    }

    private ArrayList<String> readExpected(String path) throws FileNotFoundException {
        Scanner s = new Scanner(new File(path));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.nextLine());
        }
        s.close();
        return list;
    }
}
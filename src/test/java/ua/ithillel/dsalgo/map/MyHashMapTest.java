package ua.ithillel.dsalgo.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyHashMapTest {
    private MyHashMap<String, Integer> map;

    @BeforeEach
    void setUp() {
        map = new MyHashMap<>();
    }

    @Test
    void putTest_noExceptionThrown() {
        String key = "key";
        Integer value = 5;

        map.put(key, value);
    }

    @Test
    void putTest_afterPuttingSizeNotZero() {
        String key = "key";
        Integer value = 5;

        map.put(key, value);

        int size = map.size();

        assertNotEquals(size, 0);
    }

    @Test
    void putTest_afterPuttingSameKeyNewValueIsReturned() {
        String key = "key";
        Integer value = 5;
        map.put(key, value);

        Integer newValue =  6;
        map.put(key, newValue);

        Integer i = map.get(key);

        assertEquals(i, newValue);
    }

    @Test
    void getTest_emptyReturnsNull() {
        Integer i = map.get("key");

        assertNull(i);
    }

    @Test
    void getTest_nonEmptyReturnsValue() {
        String key = "key";
        Integer value = 5;
        map.put(key, value);

        Integer i = map.get(key);

        assertNotNull(i);
        assertEquals(value, i);
    }
}

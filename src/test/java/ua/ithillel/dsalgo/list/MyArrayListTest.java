package ua.ithillel.dsalgo.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    private MyArrayList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new MyArrayList<>();
    }

    @Test
    void sizeTest_emptyReturnsZero() {
        int size = list.size();

        assertEquals(size, 0);
    }

    @Test
    void sizeTest_nonEmptyDoesNotReturnZero() {
        list.add(1);
        int size = list.size();

        assertNotEquals(size, 0);
    }

    @Test
    void isEmptyTest_emptyReturnsTrue() {
        boolean empty = list.isEmpty();

        assertTrue(empty);
    }

    @Test
    void isEmptyTest_notEmptyReturnsFalse() {
        list.add(1);
        boolean empty = list.isEmpty();

        assertFalse(empty);
    }

    @Test
    void getTest_emptyThrowsRuntimeException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    void getTest_indexWithinBoundariesReturnsValue() {
        list.add(1);
        list.add(1);
        list.add(1);
        Integer i = list.get(1);

        assertNotNull(i);
    }

    @Test
    void setTest_emptyThrowsRuntimeException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(1, 2));
    }

    @Test
    void setTest_withinBoundariesReturnsNonNull() {
        Integer testValue = 1;
        list.add(testValue);
        list.add(testValue);
        list.add(testValue);

        Integer newTestValue = 2;

        Integer set = list.set(1, newTestValue);

        assertNotNull(set);
        assertNotEquals(set, testValue);
    }

    @Test
    void addTest_IsNotEmpty() {
        list.add(1);

        boolean empty = list.isEmpty();
        assertFalse(empty);
    }

    @Test
    void addTest_sizeIsNotZero() {
        list.add(1);

        int size = list.size();
        assertNotEquals(size, 0);
    }

    @Test
    void removeTest_emptyThrowsRuntimeException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    void removeTest_sizeGetLess() {
        Integer testValue = 1;
        Integer testValueToRemove = 2;

        list.add(testValue);
        list.add(testValueToRemove);
        list.add(testValue);

        int origSize = list.size();

        Integer removed = list.remove(1);

        int sizeAfterRemoval = list.size();

        assertNotNull(removed);
        assertEquals(removed, testValueToRemove);
        assertTrue(sizeAfterRemoval < origSize);
    }
}

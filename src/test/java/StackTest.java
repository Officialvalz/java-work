import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackTest {
    @Test
    void pushAndPeekReturnLatestValue() {
        Stack stack = new Stack();

        stack.push("first");
        stack.push("second");

        assertEquals(2, stack.size());
        assertEquals("second", stack.peek());
    }

    @Test
    void popRemovesAndReturnsTopValue() {
        Stack stack = new Stack();
        stack.push("first");
        stack.push("second");

        Object removed = stack.pop();

        assertEquals("second", removed);
        assertEquals(1, stack.size());
        assertEquals("first", stack.peek());
    }

    @Test
    void searchCountsFromTop() {
        Stack stack = new Stack();
        stack.push("first");
        stack.push("second");
        stack.push("third");

        assertEquals(1, stack.search("third"));
        assertEquals(3, stack.search("first"));
        assertEquals(-1, stack.search("missing"));
    }

    @Test
    void emptyStackThrowsOnPop() {
        Stack stack = new Stack();

        RuntimeException exception = assertThrows(RuntimeException.class, stack::pop);

        assertTrue(exception.getMessage().contains("Cannot pop"));
    }
}

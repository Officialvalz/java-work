public class Stack {
    private Object[] elements;
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        elements = new Object[DEFAULT_CAPACITY];
        topIndex = -1;
    }

    public static void main(String... args) {
        Stack stack = new Stack();
        stack.push("first");
        stack.push("second");
        System.out.println(stack);
    }

    public Object push(Object newValue) {
        if (topIndex == elements.length - 1) {
            expandCapacity();
        }
        topIndex++;
        elements[topIndex] = newValue;
        return newValue;
    }

    public Object pop() {
        if (empty()) {
            throw new RuntimeException("EmptyStackException: Stack is empty. Cannot pop.");
        }
        Object removedValue = elements[topIndex];
        elements[topIndex] = null;
        topIndex--;
        return removedValue;
    }

    public Object peek() {
        if (empty()) {
            throw new RuntimeException("EmptyStackException: Stack is empty. Cannot peek.");
        }
        return elements[topIndex];
    }

    public boolean empty() {
        return topIndex == -1;
    }

    public int search(Object searchValue) {
        for (int currentIndex = topIndex; currentIndex >= 0; currentIndex--) {
            Object currentValue = elements[currentIndex];
            if (currentValue == null ? searchValue == null : currentValue.equals(searchValue)) {
                return (topIndex - currentIndex) + 1;
            }
        }
        return -1;
    }

    public int size() {
        return topIndex + 1;
    }

    private void expandCapacity() {
        Object[] largerArray = new Object[elements.length * 2];
        for (int copyIndex = 0; copyIndex < elements.length; copyIndex++) {
            largerArray[copyIndex] = elements[copyIndex];
        }
        elements = largerArray;
    }

    @Override
    public String toString() {
        if (empty()) {
            return "Stack: [EMPTY]";
        }

        StringBuilder result = new StringBuilder("TOP -> ");
        for (int currentIndex = topIndex; currentIndex >= 0; currentIndex--) {
            result.append("[").append(elements[currentIndex]).append("]");
            if (currentIndex > 0) {
                result.append(", ");
            }
        }
        result.append(" <- BOTTOM");
        return result.toString();
    }
}

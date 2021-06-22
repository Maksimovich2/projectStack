import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        StackMas stack = new StackMas(5);

        Person personMax = new Person("Maksim", "Shesterkin", 18);
        Person personAndrey = new Person("Andrey", "Shesterkin", 24);
        Person personAndrew = new Person("Andrey", "Shesterkin", 24);

        stack.push(personMax);
        stack.push(personAndrew);
        stack.push(personAndrey);


        System.out.println("Стек: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}

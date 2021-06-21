import java.util.EmptyStackException;

public class StackMas {

    Person[] stack;
    int top;
    int sizeStack;

    public StackMas(int sizeStack) {
        this.sizeStack = sizeStack;
        stack = new Person[sizeStack];
        top = -1;
    }
    private void isUniqPerson(Person[] stack, Person addPerson){
        if(addPerson == null){
            throw new IllegalArgumentException("person equal null!");
        }
            for (int i = 0; i < stack.length; i++) {
                if(addPerson.equals(stack[i])){
                    throw new IllegalArgumentException("person already add in stack persons!!!");
                }
            }
        }

    void push(Person person){
        if (person == null) {
            throw new IllegalArgumentException("person equal null!");
        }
            if (stack.length <= sizeStack){
                isUniqPerson(stack, person);
                stack[++top] = person;
            }
    }
    Person peek(){
        if (top == -1)
            throw new EmptyStackException();
        return stack[top];
    }
    Person pop(){
            return stack[top--];
    }
    boolean isEmpty(){
        return (top==-1);
    }
}

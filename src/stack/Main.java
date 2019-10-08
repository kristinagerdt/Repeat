package stack;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(6);

        for (int i = 0, j = 2; i < myStack.getSize(); i++, j++) {
            myStack.push(j);
            System.out.println(myStack.toString());
        }

        System.out.println();

        for (int i = 0; i < myStack.getSize(); i++) {
            int lastNum = myStack.pop();
            System.out.println(myStack.toString() + " last number = " + lastNum);
        }
    }
}
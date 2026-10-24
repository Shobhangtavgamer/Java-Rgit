import java.util.Scanner;

public class StackUsingArray {
    private int[] stack;
    private int top;

    StackUsingArray(int size) {
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow! The stack is full.");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into the stack.");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! The stack is empty.");
        } else {
            System.out.println(stack[top--] + " popped from the stack.");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Stack size must be greater than zero.");
            sc.close();
            return;
        }

        StackUsingArray stack = new StackUsingArray(size);
        int choice;

        do {
            System.out.println("\n===== Stack Operations =====");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting stack program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

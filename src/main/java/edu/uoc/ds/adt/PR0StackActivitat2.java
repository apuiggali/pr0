package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;
import java.time.LocalDate;

public class PR0StackActivitat2 {
    public final int CAPACITY = 10;
    public final LocalDate INICIDATA = LocalDate.of(2023,9,28);
    public final int DESPLACAMENT = 2;

    private Stack<String> stack;

    public PR0StackActivitat2() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<String>(CAPACITY);
    }


    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString();
    }

    public Stack<String> getStack() {
        return this.stack;
    }

    public void push(String c) {
        this.stack.push(c);
    }
}

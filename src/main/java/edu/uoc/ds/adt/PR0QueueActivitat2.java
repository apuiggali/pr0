package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

import java.time.LocalDate;

public class PR0QueueActivitat2 {

    public final int CAPACITY = 10;
    public final LocalDate INICIDATA = LocalDate.of(2023,9,28);
    public final int DESPLACAMENT = 2;

    private Queue<String> queue;

    public PR0QueueActivitat2() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }


    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        char r;
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        return sb.toString();
    }

    public Queue<String> getQueue() {
        return this.queue;
    }

    public void add(String c) {
        this.queue.add(c);
    }
}

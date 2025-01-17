package com.wiley.javainterviewsexposed.chapter05;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Queues {

    @Test
    public void queueInsertion() {
        final Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        assertEquals("first", queue.remove());
        assertEquals("second", queue.remove());
        assertEquals("third", queue.peek());
        assertEquals("third", queue.remove());
    }

}

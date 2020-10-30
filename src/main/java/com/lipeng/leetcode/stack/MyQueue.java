package com.lipeng.algorithm.leetcode.stack;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @program: self-practice
 * @description: 用栈实现队列
 * @author: LiPeng
 * @create: 2020-10-13 22:17
 **/
public class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    private int head;

    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public int push(int x) {
        if (s1.isEmpty()){
            head = x;
        }
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s2.push(x);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return x;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int x = s1.pop();
        if (!s1.isEmpty()){
            head = s1.peek();
        }
        return x;
    }

    /** Get the front element. */
    public int peek() {
        return head;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }

}

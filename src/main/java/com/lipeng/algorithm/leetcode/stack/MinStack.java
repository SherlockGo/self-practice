package com.lipeng.algorithm.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @program: self-practice
 * @description: 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * @author: LiPeng
 * @create: 2020-10-12 22:13
 **/
public class MinStack {
    Deque<Integer> dataStack;  //数据栈
    Deque<Integer> minStack;  //辅助栈，用来保存最小元素

    public MinStack(){
        dataStack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int x) {
        dataStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop() {
        int x = dataStack.pop();
        if (x == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);

        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.top());

    }

}

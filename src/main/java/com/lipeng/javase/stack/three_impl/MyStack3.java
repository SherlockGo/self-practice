package com.lipeng.javase.stack.three_impl;

import java.util.LinkedList;

/**
 * @program: self-practice
 * @description: LinkedList实现栈
 * @author: LiPeng
 * @create: 2020-10-12 23:39
 **/
public class MyStack3<T> {

    private LinkedList<T> linkedList = new LinkedList<>();

    //入栈
    public void push(T t){
        linkedList.addFirst(t);
        //linkedList.push(t);
    }

    //出栈
    public T pop(){
        return linkedList.removeFirst();
        //return linkedList.pop();
    }

    //栈顶元素
    public T peek(){
        T t = null;
        if (!linkedList.isEmpty()){
            t = linkedList.getFirst();
            //t = linkedList.peek();
        }
        return t;
    }

    //判断栈空
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }


    public static void main(String[] args) {
        MyStack3<String> stack = new MyStack3();
        System.out.println(stack.isEmpty());  //true
        System.out.println(stack.peek());  //null
        stack.push("java");
        stack.push("is");
        stack.push("beautiful");
        System.out.println(stack.peek());  //beautiful
        System.out.println(stack.pop());  //beautiful
        System.out.println(stack.isEmpty());  //false
        System.out.println(stack.peek());  //is

    }

}

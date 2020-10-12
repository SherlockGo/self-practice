package com.lipeng.javase.stack.three_impl;

import java.util.Arrays;

/**
 * @program: self-practice
 * @description: 数组实现栈
 * @author: LiPeng
 * @create: 2020-10-12 22:52
 **/
public class Mystack1<T> {

    private Object[] stack;  //实现栈的数组

    private int size;  //数组大小

    public Mystack1(){
        stack = new Object[10];  //初始容量为10
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //返回栈顶元素
    public T peek(){
        T t = null;
        if (size > 0)
            t = (T) stack[size - 1];
        return t;
    }

    //入栈
    public void push(T t){
        expandCapacity(size + 1);
        stack[size] = t;
        size++;
    }

    //出栈
    public T pop(){
        T t = peek();
        if (size > 0){
            stack[size - 1] = null;
            size--;
        }
        return t;
    }

    //扩容
    public void expandCapacity(int size){
        int len = stack.length;
        if (size > len){
            size = size * 3 / 2 + 1;
            stack = Arrays.copyOf(stack, size);
        }
    }

    public static void main(String[] args) {
        Mystack1<String> stack = new Mystack1<>();
        System.out.println(stack.peek());  //null
        System.out.println(stack.isEmpty());  //true
        stack.push("java");
        stack.push("is");
        stack.push("beautiful");
        stack.push("language");
        System.out.println(stack.pop());  //language
        System.out.println(stack.isEmpty());  //false
        System.out.println(stack.peek());  //beautiful
    }

}

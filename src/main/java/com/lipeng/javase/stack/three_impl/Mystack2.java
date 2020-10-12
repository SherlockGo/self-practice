package com.lipeng.javase.stack.three_impl;

/**
 * @program: self-practice
 * @description: 链表实现栈
 * @author: LiPeng
 * @create: 2020-10-12 23:20
 **/
public class Mystack2<T> {

    //定义链表节点
    class Node<T>{
        private T t;
        private Node next;
    }

    private Node<T> head;

    //构造函数初始化头指针
    Mystack2(){
        head = null;
    }

    //入栈
    public void push(T t){
        if (t == null){
            throw new NullPointerException("参数不能为空");
        }
        if (head == null){
            head = new Node<>();
            head.t = t;
            head.next = null;
        } else{
            Node<T> temp = head;
            head = new Node<>();
            head.t = t;
            head.next = temp;
        }
    }

    //出栈
    public T pop(){
        T t = head.t;
        head = head.next;
        return t;
    }

    //栈顶元素
    public T peek(){
        return head.t;
    }

    //判断为空
    public boolean isEmpty(){
        if (head == null)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        Mystack2 stack = new Mystack2();
        System.out.println(stack.isEmpty()); //true
        stack.push("Java");
        stack.push("is");
        stack.push("beautiful");
        System.out.println(stack.peek()); //beautiful
        System.out.println(stack.peek()); //beautiful
        System.out.println(stack.pop());  //beautiful
        System.out.println(stack.pop());  //is
        System.out.println(stack.isEmpty());  //false
        System.out.println(stack.pop());  //Java
        System.out.println(stack.isEmpty()); //true
    }

}

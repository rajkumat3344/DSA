package org.rdutta.dsa.stack.implementation;

import java.util.Scanner;

public class StackArrayImplementation {

        public int top;
        public int MAX_SIZE;
        public int[] arr;

    StackArrayImplementation(int MAX_SIZE){
            this.MAX_SIZE = MAX_SIZE;
            this.arr = new int[MAX_SIZE];
            this.top = -1;
        }



    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int element){

        if(top == MAX_SIZE-1){
            System.out.println("Stack is Full!");
            return;
        }

        top = top + 1;
        arr[top] = element;
        System.out.println("Pushed element in the array:: "+element);
    }


    public int pop(){
        if(top == -1){
            System.out.println("Stack is Empty!");
            return -1;
        }

        int popOutItem = arr[top];
        top = top - 1;
        System.out.println("Pop Out element:: "+popOutItem);
        return popOutItem;
    }

    public int peek(){
       if(top != -1){
           return arr[top];
       }
       else{
           System.out.println("Stack is empty!");
           return -1;
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfTheStackArray = sc.nextInt();

        StackArrayImplementation stack = new StackArrayImplementation(sizeOfTheStackArray);
        stack.push(1);
        stack.push(2);
        stack.push(3);


        stack.pop();

        System.out.println("Current top element:: "+stack.peek());
    }
}

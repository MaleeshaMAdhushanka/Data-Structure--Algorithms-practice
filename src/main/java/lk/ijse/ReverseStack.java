package lk.ijse;

public class ReverseStack {
    public static void main(String[] args) {
        ReverseStack reverse = new ReverseStack(4);

        reverse.push("I");
        reverse.push("J");
        reverse.push("S");
        reverse.push("E");

        reverse.pop();
        reverse.pop();
        reverse.pop();
        reverse.pop();
    }
    int start;
    String [] arr;
    int top;
    int cap;

    ReverseStack(int size){
        cap = size;
        start = 0;
        top = -1;
        arr = new String[size];
    }

    boolean isFull(){
        return  top +1 == cap;
    }

     void push(String x) {
        if (isFull()){
            System.out.println("Stack is full .");
        }else {
            top++;
            arr[top] = x;
            System.out.println("\033[0;31m"+x+"\t "+ "\033[0m");
        }

    }
    void printStack(){
        for (int i = 0; i < top+1; i++) {
            System.out.println(arr[i] + " ,");
        }
        System.out.println();
    }
    boolean isEmpty(){
        return  top+1 == start;
    }
     void pop() {

        if (isEmpty()){
            System.out.println("Stack is Emoty . Add some data ");
        }else {
            System.out.println("\033[1;31m"+arr[top] +"\t"+ "\033[0m");
            top--;
        }
    }

}

package lk.ijse;

//stack implement using arrays
public class Stack {
    public static void main(String[] args) {

        Stack myStack = new Stack(5);
        //class ekenma hadagththa object ekak


        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        myStack.printTop();
        myStack.printStack();
        myStack.pop();
        myStack.printStack();


    }

    int capasity; // size = 5
    int top; //-1 // top ++ methna den 0 wenawa
    int[] arr; // size = 5
    int start; //0


    //object creation ekedi eke constructor call una
    Stack(int size) {
        capasity = size;
        top = -1;
        arr = new int[size];
        start = 0;
    }

    //stack eka full da kiyala balanawa true or false
    boolean isFull() {
//        return top + 1 == capasity;
//         //top  = -1
        //-1 +1 = 0 == 5
        if (top + 1 == capasity){
            return true;
        }
        return  false;
    }

    private void push(int x) {
        if (isFull()) {
            System.out.println("stack is full .");

        } else {
            top++; // 0
            // arr[top]=10
            arr[top] = x;
            System.out.println(x + "is added Sucsessfully ");
        }

    }

    boolean isEmpty() {
        return top + 1 == start; //3 + 1 == 0

    }


    void pop() {
        //Error ofBound eka ena nisa thama methana check krala thiyen condition ekak dala
        if (isEmpty()) {
            System.out.println("Stack is Empty . Add some data");
        } else {
                          // 40 print kara
            System.out.println(arr[top] + " is removeing now");
            top--;
        }
    }
    //stack printing this method
    void printStack() {

        for (int i = 0; i < (top + 1); i++) {
            System.out.println(arr[i]);
        }
    }
    void printTop(){
        System.out.println(top);
    }

}


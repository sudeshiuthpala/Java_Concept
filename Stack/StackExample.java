class StackExample{
    public static int top=-1,max=10;

    static void push(int[] stack,int val){
        if(top==max-1){
            System.out.println("Overflow");
        }else{
           top=top+1;
           stack[top]=val;
          
        }
    }
    static void pop(int[] stack){
       // System.out.println("x");
        int val;
        if(top==-1){
            System.out.println("underflow");
        }else{
            val=stack[top];
            top=top-1;
            //System.out.println(val);
        }
    }
    static void display(int[] stack){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
    static int peek(int[] stack){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        return (stack[top]);
    }
    public static void main(String[] args){
        int[] stack=new int[10];
        for(int i=0;i<10;i++){
            push(stack,i);
        } 
       // display(stack);
        pop(stack);
        pop(stack);
        display(stack);
        // for(int i=0;i<10;i++){  
        //     //pop(stack); 
        //     System.out.println(stack[i]);
        // }
        System.out.println(peek(stack));
    }
}
class Parentheses{
    public static int top=-1,max=10;

    static void push(char[] stack,char val){
        if(top==max-1){
            System.out.println("Overflow");
        }else{
           top=top+1;
           stack[top]=val;
          
        }
    }
    static void pop(char[] stack){
       // System.out.println("x");
        char val;
        if(top==-1){
            System.out.println("underflow");
        }else{
            val=stack[top];
            top=top-1;
            return (val);
            //System.out.println(val);
        }
    }
    static void display(char[] stack){
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
        char[] exp="{[()]}";
        int flag=1;
        char[] stack=new char[10];
        for(int i=0;i<exp.length();i++){
            if(exp[i]=='(' || exp[i]=='{' || exp[i]=='['){
                push(stack,exp[i]);
            }
            if(exp[i]==')' || exp[i]=='}' || exp[i]==']'){
                if(top==-1){
                    flag=0;
                }
                else{
                    char temp=pop(stack);
                    if(exp[i]==')' && (temp=='{' || temp=='[')){
                        flag=0;
                    }
                    if(exp[i]=='}' && (temp=='(' || temp=='[')){
                        flag=0;
                    }
                    if(exp[i]==']' && (temp=='(' || temp=='{')){
                        flag=0;
                    }
                }
            }    
        } 
        if(top>=0){
            flag=0;
        }
        if(flag==1){
            System.out.println("valid exp");
        }else{
            System.out.println("invalid exp");
        }
       // display(stack);
        // pop(stack);
        // pop(stack);
        // display(stack);
        // // for(int i=0;i<10;i++){  
        // //     //pop(stack); 
        // //     System.out.println(stack[i]);
        // // }
        // System.out.println(peek(stack));
    }
}
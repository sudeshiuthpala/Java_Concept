public class QueueExample{
    public static int front=-1,rear=1,max=10;
    static void enqueue(int[] queue,int val){
        System.out.println("dsda!");
        if(rear==max-1){
            System.out.println("queue is overflow!");
        }
        else if(front==-1 ){
            front=0;
            rear=0;
            //System.out.println("set!");
        }
        else{
            rear=rear+1;
        }
        queue[rear]=val;
    }
    static int dequeue(int[] queue){
        int val=0;
        if(front==-1 || front > rear){
            System.out.println("queue is underflow!");
        }
        else{
            val=queue[front];
            front=front+1;
        }
        return val;
    }
    static void display(int[] queue){
        if(front==-1 || front > rear){
            System.out.println("queue is empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.println(queue[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] queue=new int[10];
        enqueue(queue,10);
        enqueue(queue,12);
        display(queue);
        System.out.println(dequeue(queue));
        System.out.println(dequeue(queue));
        System.out.println(dequeue(queue));

    } 
}
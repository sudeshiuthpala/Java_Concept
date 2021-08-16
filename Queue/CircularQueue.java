public class CircularQueue{
    public static int front=0,rear=0,max=3,count=0;
    static void enqueuecq(int[] queue,int val){
        //System.out.println("dsda!");
        if(count==max){
            System.out.println("circular queue is full!");
        }
        else{
            queue[rear]=val;
            rear=(rear+1)%max;
            count++;
        }
    }
    static void dequeuecq(int[] queue){
        int val=0;
        if(count==0){
            System.out.println("queue is empty!");
        }
        else{
            val=queue[front];
            front=(front+1)%max;
            count--;
        }
    }
    static void displaycq(int[] queue){
        if(count==0){
            System.out.println("queue is empty!");
        }
        else{
            int j=count;
            for(int i=front;j!=0;j--){
                System.out.println(queue[i]);
                i=(i+1)%max;
            }
        }
    }
    public static void main(String[] args) {
        int[] queue=new int[3];
        enqueuecq(queue,10);
        enqueuecq(queue,12);
        enqueuecq(queue,15);
        //displaycq(queue);
        dequeuecq(queue);
        enqueuecq(queue,16);
        displaycq(queue);
        //System.out.println(dequeue(queue));
        //System.out.println(dequeue(queue));

    } 
}
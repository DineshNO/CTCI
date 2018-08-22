import java.util.Stack;

public class QueueUsingStack {

    private Stack<Object> stack1 = new Stack<>();
    private Stack<Object> stack2 =  new Stack<>();

    public void enQueue(int data){
        int len = stack2.size();
        if(len > 0){
            for (int i = 0;i < len;i++){
                Object a = stack2.pop();
                stack1.push(a);
            }
        }
        stack1.push(data);
    }

    public Object deQueue(){
        int len = stack1.size();
        if(len > 0){
            for(int i = 0;i < len;i++){
                Object a = stack1.pop();
                stack2.push(a);
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        for(int j = 0;j < 5;j++){
            q.enQueue(j);
            System.out.print(j + " -> ");
        }
        System.out.println();
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }

}

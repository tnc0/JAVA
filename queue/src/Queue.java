public class Queue {
    int[] queueAdd(int[] queue, int new_value){
        int[] newqueue = new int[queue.length + 1];
        for(int e = 0; e < queue.length; e++){
            newqueue[e + 1] = queue[e];
        }
        newqueue[0] = new_value;        
        return newqueue;
    }

    int[] queueDel(int[] queue){
        int[] newqueue = new int[queue.length - 1];
        for(int e = 0; e < queue.length - 1; e++){
            newqueue[e] = queue[e];
        }
        return newqueue;
    }

    void queueSearch(int[] queue, int goal){
        int counter = 0;
        int[] newqueue = new int[queue.length];
        
        for(int i = 0; i < queue.length; i++){
            if(queue[i] == goal){
                counter += 1;
                newqueue[i] = queue[i];
            }
        }
        System.out.println("Counter:" + counter);
        System.out.print("Finded indexs: ");
        WriteList(newqueue);
    }
    
    void WriteList(int[] dizi){
        for(int e = 0; e < dizi.length; e++){
            System.out.print(dizi[e]+" ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) throws Exception {
        Queue queue_object = new Queue();
        int[] queue = {1,2,3,2,4};

        int[] added_queue = queue_object.queueAdd(queue,9);
        queue_object.WriteList(added_queue);
        int[] deleted_queue = queue_object.queueDel(queue);
        queue_object.WriteList(deleted_queue);
        
        queue_object.queueSearch(queue,2);

    }
}

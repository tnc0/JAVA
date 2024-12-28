public class Stack { // Yigin
    int[] stackAdd(int[] stack, int new_value){
        int[] newstack = new int[stack.length + 1];
        for(int e = 0; e < stack.length; e++){
            newstack[e] = stack[e];
        }
        newstack[stack.length] = new_value;
        return newstack;
    }

    int[] stackDel(int[] stack){
        int[] newstack = new int[stack.length - 1];
        for(int e = 0; e < stack.length - 1; e++){
            newstack[e] = stack[e];
        }
        return newstack;
    }

    
    void stackSearch(int[] stack, int goal){
        int counter = 0;
        int[] newstack = new int[stack.length];
        
        for(int i = stack.length; i >= 0; i--){
            if(stack[i] == goal){
                counter += 1;
                newstack[i] = stack[i];
            }
        }
        System.out.println("Counter:" + counter);
        System.out.print("Finded indexs: ");
        WriteList(newstack);
    }
    
    void WriteList(int[] dizi){
        for(int e = 0; e < dizi.length; e++){
            System.out.print(dizi[e]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Stack stack_object = new Stack();
        int[] stack = {1,2,3,2,4};

        int[] added_stack = stack_object.stackAdd(stack,9);
        stack_object.WriteList(added_stack);
        int[] deleted_stack = stack_object.stackDel(stack);
        stack_object.WriteList(deleted_stack);

        stack_object.stackSearch(stack,2);
    }
}

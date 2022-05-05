package Tugas;

public class TugasStackLink {
        TugasStackSLL top;  
        
        public boolean isEmpty(){
            return top == null;
        }
    
        public void push(String input){
            TugasStackSLL temp = new TugasStackSLL(input, null);
            if(isEmpty()){ 
                top = temp; 
            } else {
                temp.next = top;
                top = temp;
            }
        }
        
        public void pop(){
            if(isEmpty()){
                System.out.println("Stack kosong");
                return;
            } 
            top = top.next;
            }
        
        public void peek(){
            if(!isEmpty()){
                TugasStackSLL temp = top;
                System.out.println("Stack teratas = " + top.data);
            }else{
                System.out.println("Stack kosong");
            }
        }
        
        public void print(){
            if(isEmpty()){
                System.out.println("Stack kosong");
            } else { 
                TugasStackSLL temp = top;
                while(temp != null){
                    System.out.println(temp.data + "\t");
                    temp = temp.next;
                }
                System.out.println("");
            }
        }
}
    


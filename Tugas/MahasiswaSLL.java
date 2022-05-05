package Tugas;

    public class MahasiswaSLL {
        MahasiswaL head;
        MahasiswaL tail;
        
            
        public boolean isEmpty(){
            return head == null;
        }
    
        public void print(){
            if(!isEmpty()){
                MahasiswaL temp = head;
                int i = 0;
                System.out.print("Isi Mahasiswa:\t");
                while (temp != null){
                    System.out.println("Data Mahasiswa ke-" + i + "= " + temp.nim + " " + temp.nama + " " + temp.absen
                    + " " + temp.ipk);
                    temp = temp.next;
                    i++;
                }
                System.out.println("");
            } else {
                System.out.println("Queue kosong");
            }
        }
    
        public void peek(){
            if(!isEmpty()){
                MahasiswaL temp = head;
                System.out.println("Data mahasiswa terdepan= " + temp.nim + " " + temp.nama + " " + temp.absen
                    + " " + temp.ipk);
            } else {
                System.out.println("Queue kosong");
            }
        }
        
        public void peekRear(){
            if(!isEmpty()){
                MahasiswaL temp = head;
                while(temp != null){
                    if(temp == tail){
                        System.out.println("Antrian paling belakang = " + temp.nim + " " + temp.nama + " " + temp.absen
                    + " " + temp.ipk);
                    }else {
                        System.out.println("Queue kosong");
                    }
                    temp = temp.next;
                }
            }
        }
        
        public void peekIndex(int index){
            MahasiswaL temp = head;
            for (int i = 0; i < index - 1; i++){
                    temp = temp.next;
                }
            System.out.println("Data mahasiswa pada indeks ke-" + index + "= " + temp.nim + " " + temp.nama + " " + temp.absen
                    + " " + temp.ipk);
        }
        
        public int peekData(int key){
            MahasiswaL temp = head;
            int index = 0;
            while (temp != null && temp.absen != key){
                temp = temp.next;
                index++;
            }
            if(temp == null){
                System.out.println("Queue kosong");
                return -1;
            } else {
                System.out.println("Data mahasiswa " + key + "berada pada index ke-" + index);
                System.out.println("Data mahasiswa " + temp.nim + " " + temp.nama + " " + temp.absen
                    + " " + temp.ipk);
                return index;
            }
        }
    
        
        public void enqueue(String nim, String nama, int absen, double ipk){
            MahasiswaL temp = new MahasiswaL(nim, nama, absen, ipk, null);
            if(isEmpty()){ 
                head = temp; 
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
        
        public void dequeue(){
            if(isEmpty()){
                System.out.println("Queue, tidak dapat dihapus");
            } else if (head == tail){
                head = tail = null;
            } else {
                head = head.next;
            }
        }
        
        public void clear(int data){
            if(!isEmpty()){
                head = tail = null;
                data = 0;
                System.out.println("Data mahasiswa dikosongkan");
            } else {
                System.out.println("Queue Kosong");
            }
        }
        
        
    }


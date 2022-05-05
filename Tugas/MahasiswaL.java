package Tugas;

    public class MahasiswaL {
        String nim;
        String nama;
        int absen;
        double ipk;
        MahasiswaL next;
        
        public MahasiswaL(String nim, String nama, int absen, double ipk, MahasiswaL lanjut){
            this.nim = nim;
            this.nama = nama;
            this.absen = absen;
            this.ipk = ipk;
            this.next = lanjut;
        }    
    }
    


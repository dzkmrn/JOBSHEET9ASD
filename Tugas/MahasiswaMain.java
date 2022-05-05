package Tugas;

import java.util.Scanner;
public class MahasiswaMain {
        public static void menu(){
            System.out.println("Pilih menu: ");
            System.out.println("1. Data Mahasiswa baru");
            System.out.println("2. Data Mahasiswa keluar");
            System.out.println("3. Cek data mahasiswa terdepan");
            System.out.println("4. Cek data mahasiswa paling belakang");
            System.out.println("5. Cek semua antrian");
            System.out.println("6. Cari penempatan mahasiswa berdasar absen");
            System.out.println("7. Cari mahasiswa dengan indeks");
            System.out.println("8. Clear data");
            System.out.println("==============");
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Scanner s = new Scanner(System.in);
            
            System.out.print("Masukkan kapasitas Queue: ");
            int jumlah = sc.nextInt();
            
            MahasiswaSLL antri = new MahasiswaSLL();
            
            int pilih;
            
            do{
                menu();
                pilih = sc.nextInt();
                sc.nextLine();
                switch(pilih){
                    case 1:
                        System.out.print("NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Absen: ");
                        int absen = s.nextInt();
                        System.out.print("IPK: ");
                        double ipk = s.nextDouble();
                        antri.enqueue(nim, nama, absen, ipk);
                        break;
                    
                    case 2:
                        antri.dequeue();
                        break;
                    
                    case 3:
                        antri.peek();
                        break;
                    
                    case 4:
                        antri.peekRear();
                        break;
                        
                    case 5:
                        antri.print();
                        break;
                        
                    case 6:
                        System.out.print("Masukkan absen mahasiswa: ");
                        int absene = s.nextInt();
                        antri.peekData(absene);
                        break;
                        
                    case 7:
                        System.out.print("Masukkan indeks yang dicari: ");
                        int indeks = s.nextInt();
                        antri.peekIndex(indeks);
                        break;
                     
                    case 8: 
                        antri.clear(jumlah);
                        break;
                }
            }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
        }
    }


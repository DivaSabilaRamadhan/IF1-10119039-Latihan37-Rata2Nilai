/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deksripsi Program : Program ini berisi nilai rata-rata maasiswa menggunakan 
 *                      pendekatan objek
 */
public class RataNilai {

    public int banyakMhs;
    public double totalNilai, nilaiRataRata;
    public double[] nilaiMhs;
    
    public void inputMhs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyak mahasiswa : ");
        banyakMhs = scanner.nextInt();    
    }
    
    public void inputNilai(){
        totalNilai = 0;
        nilaiMhs = new double[banyakMhs];
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < banyakMhs; i++) {
           System.out.print("Nilai Mahasiswa ke- " + (i+1) + " : ");
           nilaiMhs[i] = scanner.nextInt();
           totalNilai += nilaiMhs[i];
        }
    }
    
    
    public void nilaiRataRata(){
        nilaiRataRata = totalNilai/banyakMhs;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        RataNilai nilai = new RataNilai();
        nilai.inputMhs();
        nilai.inputNilai();
        nilai.nilaiRataRata();
        
        System.out.print("\n");
        System.out.println("Maka, Rata-rata dari Nilai adalah : " + nilai.nilaiRataRata);
        System.out.println("Developed by : Diva Sabila Ramadhan");
    }
    
}

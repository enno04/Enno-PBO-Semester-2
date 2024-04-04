package org.example;

import java.util.Scanner;

class MahasiswaUmm{
    static String universitasUmm = "Universitas Muhammadiyah Malang";
    String namamahasiswa;
    String nimmahasiswa;
    String jurusanmahasiswa;

    MahasiswaUmm(String name, String nim, String majoring){
        this.namamahasiswa = name;
        this.nimmahasiswa = nim;
        this.jurusanmahasiswa = majoring;
    }

    static void tampilUniversitas(){
        System.out.println("Profile Data " + universitasUmm);
    }

    void tampilDataMahasiswa(){
        System.out.println("Nama Mahasiswa: " + namamahasiswa);
        System.out.println("NIM Mahasiswa: " + nimmahasiswa);
        System.out.println("Jurusan Mahasiswa: " + jurusanmahasiswa);
    }
}

public class Main {
    public static void main(String[] args){
        MahasiswaUmm.tampilUniversitas();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa UMM: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM Mahasiswa UMM (max 15 digit): ");
        String nim = scanner.nextLine();
        while (nim.length() > 15){
            System.out.println("Panjang NIM tidak boleh lebih dari 15 digit.");
            System.out.print("Masukkan NIM Mahasiswa UMM (max 15 digit): ");
            nim = scanner.nextLine();
        }

        System.out.print("Masukkan Jurusan Mahasiswa UMM: ");
        String jurusan = scanner.nextLine();

        MahasiswaUmm mahasiswa = new MahasiswaUmm(nama, nim, jurusan);
        System.out.println("\nData Mahasiswa Universitas Muhammadiyah Malang: ");
        mahasiswa.tampilDataMahasiswa();

        scanner.close();
    }
}
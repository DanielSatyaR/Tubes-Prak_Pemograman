package Tubes;

import java.util.Scanner;

public class BankingGraph {
    private Graph bankingGraph;
    private Scanner scanner;

    public BankingGraph() {
        bankingGraph = new Graph();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Tambah Rekening");
            System.out.println("3. Tambah Transaksi antara Rekening");
            System.out.println("4. Tampilkan Graf Jaringan Perbankan");
            System.out.println("5. Keluar");

            System.out.print("Pilih opsi: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    tambahNasabah();
                    break;
                case "2":
                    tambahRekening();
                    break;
                case "3":
                    tambahTransaksi();
                    break;
                case "4":
                    tampilkanGraf();
                    break;
                case "5":
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }

    private void tambahNasabah() {
        System.out.print("Masukkan nama nasabah: ");
        String nasabah = scanner.nextLine();
        if (nasabah.isEmpty()) {
            System.out.println("Nama nasabah tidak boleh kosong.");
        } else {
            bankingGraph.addVertex("Nasabah: " + nasabah);
            System.out.println("Nasabah " + nasabah + " berhasil ditambahkan.");
        }
    }

    private void tambahRekening() {
        System.out.print("Masukkan nomor rekening: ");
        String rekening = scanner.nextLine();
        if (rekening.isEmpty()) {
            System.out.println("Nomor rekening tidak boleh kosong.");
        } else {
            bankingGraph.addVertex("Rekening: " + rekening);
            System.out.println("Rekening " + rekening + " berhasil ditambahkan.");
        }
    }

    private void tambahTransaksi() {
        System.out.print("Masukkan nomor rekening asal: ");
        String rekeningAsal = scanner.nextLine();
        System.out.print("Masukkan nomor rekening tujuan: ");
        String rekeningTujuan = scanner.nextLine();
        if (rekeningAsal.isEmpty() || rekeningTujuan.isEmpty()) {
            System.out.println("Nomor rekening tidak boleh kosong.");
        } else {
            bankingGraph.addEdge("Rekening: " + rekeningAsal, "Rekening: " + rekeningTujuan);
            System.out.println("Transaksi antara rekening " + rekeningAsal + " dan " + rekeningTujuan + " berhasil ditambahkan.");
        }
    }

    private void tampilkanGraf() {
        bankingGraph.displayGraph();
    }
}

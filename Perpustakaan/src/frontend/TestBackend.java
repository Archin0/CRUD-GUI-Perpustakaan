/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;
import backend.*;

/**
 *
 * @author dwiah
 */
public class TestBackend {
    public static void main(String[] args)
    {
//        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
//        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
//        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");
//        
//        // test insert
//        kat1.save();
//        kat2.save();
//        kat3.save();
//        
//        // test update
//        kat2.setKeterangan("Koleksi buku referensi ilmiah");
//        kat2.save();
//        
//        // test delete
//        kat3.delete();
//        
//        // test select all
//        for(Kategori k : new Kategori().getAll())
//        {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
//        // test search
//        for(Kategori k : new Kategori().search("ilmiah"))
//        {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
        
//        Anggota ang1 = new Anggota("Duwik", "Jl. Medan", "08080808");
//        Anggota ang2 = new Anggota("Defta", "JL. Malang", "08123456");
//        Anggota ang3 = new Anggota("Shameel", "JL. Blitar", "08098765");
//        
//        ang1.save();
//        ang2.save();
//        ang3.save();
//        
//        ang2.setAlamat("JL. Banyuwangi");
//        ang2.save();
//        
//        ang3.delete();
//        
//        for(Anggota g : new Anggota().getAll())
//        {
//            System.out.println("Nama: " + g.getNama() + ", Alamat: " + g.getAlamat() + ", Telepon: " + g.getTelepon());
//        }
//        
//        for(Anggota g : new Anggota().search("Defta"))
//        {
//            System.out.println("Nama: " + g.getNama() + ", Alamat: " + g.getAlamat() + ", Telepon: " + g.getTelepon());
//        }
        
        Kategori novel = new Kategori().getById(1);
        Kategori referensi = new Kategori().getById(2);
        
        Buku bukul = new Buku (novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku buku2 = new Buku (referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku buku3 = new Buku (novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        // test insert
        bukul.save();
        buku2.save();
        
        // test update
        buku2.setJudul ("Aljabar Linier");
        buku2.save();
        
        // test delete
        buku3.delete();
        
        // test select all
        for (Buku b : new Buku().getAll()) {
            System.out.println("Kategori: " + b.getKategori().getNama () + ", Judul: " + b.getJudul());
        }
        // test search
        for (Buku b  :new Buku().search("timun")) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }
}
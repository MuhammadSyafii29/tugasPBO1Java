package model;

import jdk.swing.interop.SwingInterOpUtils;
//SuperClass/Parent-Class
public class Laptop {

    // 8 atribut class laptop

    public String namaLaptop;
    public String jenisLaptop;
    public String modelLaptop;
    public String buatanLaptop;
    public String warnaLaptop;
    public String jenisInpedia;
    public String deskripsiLaptop;
    public String Compactdisk;

    // 4 Method Class Laptop

    public void tampilkanAtribut(){
        System.out.println("======================================");
        System.out.println("Nama Laptop : "+namaLaptop);
        System.out.println("Jenis Laptop : "+jenisLaptop);
        System.out.println("Model Laptop : "+ modelLaptop);
        System.out.println("Buatan Laptop : "+ buatanLaptop);
        System.out.println("Warna Laptop : "+ warnaLaptop);
        System.out.println("Jenis Inpedia : "+ jenisInpedia);
        System.out.println("Deskripsi Laptop : "+ deskripsiLaptop );
        System.out.println("Compactdisk : "+ Compactdisk);
    }
    public void tampilkanInfoLaptop(){
        System.out.println("=====================================");
        System.out.println("Nama Laptop : "+namaLaptop);
        System.out.println("Jenis Laptop : "+jenisLaptop);
        System.out.println("Model Laptop : "+modelLaptop);
        System.out.println("Buatan Laptop : "+buatanLaptop);
        System.out.println("Warna Laptop : "+warnaLaptop);
    }
    public boolean create(){
        String insertCreate = "INSERT INTO Laptop VALUES ('"+namaLaptop+"', '"+modelLaptop+"', '"+warnaLaptop+"')";
        System.out.println(insertCreate);
        boolean berhasil = true;
        if(berhasil){
            return true;
        }else{
            return false;
        }
    }
    public boolean create(String jenisLaptop){
        String insertCreate = "INSERT INTO Laptop VALUES jenis Laptop " + jenisLaptop;
        System.out.println(insertCreate);
        return false;

    }

}

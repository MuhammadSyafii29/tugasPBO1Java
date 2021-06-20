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

    //Constructor

    public Laptop(){
        System.out.println("=================================");
        namaLaptop = "Please Isi Nama Laptop";
        jenisLaptop = "Please Isi Jenis Laptop";
        warnaLaptop = "Please Isi Warna Laptop";
        modelLaptop = "Please Isi Model Laptop";
    }
    public Laptop(String jenisLaptop, String warnaLaptop){
        this.jenisLaptop = jenisLaptop;
        this.warnaLaptop = warnaLaptop;
    }
    public Laptop(String namaLaptop, String modelLaptop, String jenisLaptop){
        this.namaLaptop = namaLaptop;
        this.modelLaptop = modelLaptop;
        this.jenisLaptop = jenisLaptop;
    }

    //Getter And Setter

    public String getNamaLaptop() {
        return namaLaptop;
    }

    public void setNamaLaptop(String namaLaptop) {
        this.namaLaptop = namaLaptop;
    }

    public String getJenisLaptop() {
        return jenisLaptop;
    }

    public void setJenisLaptop(String jenisLaptop) {
        this.jenisLaptop = jenisLaptop;
    }

    public String getModelLaptop() {
        return modelLaptop;
    }

    public void setModelLaptop(String modelLaptop) {
        this.modelLaptop = modelLaptop;
    }

    public String getBuatanLaptop() {
        return buatanLaptop;
    }

    public void setBuatanLaptop(String buatanLaptop) {
        this.buatanLaptop = buatanLaptop;
    }

    public String getWarnaLaptop() {
        return warnaLaptop;
    }

    public void setWarnaLaptop(String warnaLaptop) {
        this.warnaLaptop = warnaLaptop;
    }

    public String getJenisInpedia() {
        return jenisInpedia;
    }

    public void setJenisInpedia(String jenisInpedia) {
        this.jenisInpedia = jenisInpedia;
    }

    public String getDeskripsiLaptop() {
        return deskripsiLaptop;
    }

    public void setDeskripsiLaptop(String deskripsiLaptop) {
        this.deskripsiLaptop = deskripsiLaptop;
    }

    public String getCompactdisk() {
        return Compactdisk;
    }

    public void setCompactdisk(String compactdisk) {
        Compactdisk = compactdisk;
    }
}

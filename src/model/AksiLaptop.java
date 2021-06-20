package model;

public class AksiLaptop {
    public static void main(String[] args){

        //Object Class 1
        Laptop laptop = new Laptop();
        laptop.namaLaptop = "Asus";
        laptop.jenisLaptop = "Asus Ultraslim";
        laptop.modelLaptop = "X441B";
        laptop.buatanLaptop = "China";
        laptop.warnaLaptop = "Hitam";
        laptop.jenisInpedia = "Nvidia GeForce GTX 1080 Ti";
        laptop.deskripsiLaptop = "Anti Air";
        laptop.Compactdisk = "CD";
        laptop.tampilkanAtribut();
        laptop.create();
        laptop.create("Asus Vivobook");

        //Object Class 2
        pembeliLaptop pembeli = new pembeliLaptop();
        pembeli.namaLaptop = "Lenovo";
        pembeli.jenisLaptop = "Lenovo Ideapad";
        pembeli.modelLaptop = "330 14";
        pembeli.buatanLaptop = "China";
        pembeli.warnaLaptop = "Biru";
        pembeli.jenisInpedia = "Legion Y520 6ID";
        pembeli.deskripsiLaptop = "Anti Air";
        pembeli.Compactdisk = "CD";
        pembeli.tampilkanAtribut();
        pembeli.create();
        pembeli.create("Lenovo Yoga");
    }
}

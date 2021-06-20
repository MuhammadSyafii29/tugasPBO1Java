package model;

//SubClass/Child-Class
public class pembeliLaptop extends Laptop {

    public String namaPembeliLaptop;
    public String namaPenjualLaptop;
    public String jumlahLaptopYangDibeli;

    public void infoPenjual(){
        System.out.println("==============================================");
        System.out.println("Nama Pembeli Laptop : "+namaPembeliLaptop);
        System.out.println("Nama Penjual Laptop : "+namaPenjualLaptop);
        System.out.println("jumlah Laptop Yang Dibeli : "+jumlahLaptopYangDibeli);
    }
    public void Jumlahinfo(){
        String ji = "INSERT INTO Laptop VALUES ('"+jumlahLaptopYangDibeli+"')";
        System.out.println(ji);
    }
}

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

    //Getter And Setter

    public String getNamaPembeliLaptop() {
        return namaPembeliLaptop;
    }

    public void setNamaPembeliLaptop(String namaPembeliLaptop) {
        this.namaPembeliLaptop = namaPembeliLaptop;
    }

    public String getNamaPenjualLaptop() {
        return namaPenjualLaptop;
    }

    public void setNamaPenjualLaptop(String namaPenjualLaptop) {
        this.namaPenjualLaptop = namaPenjualLaptop;
    }

    public String getJumlahLaptopYangDibeli() {
        return jumlahLaptopYangDibeli;
    }

    public void setJumlahLaptopYangDibeli(String jumlahLaptopYangDibeli) {
        this.jumlahLaptopYangDibeli = jumlahLaptopYangDibeli;
    }
}

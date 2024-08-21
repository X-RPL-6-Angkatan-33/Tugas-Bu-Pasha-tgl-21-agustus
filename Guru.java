

public class Guru {
    
    int id;
    String nama;
    String alamat;
    String Mapel;

    public Guru(){
id = 0;
nama = "";
alamat = "";
Mapel = "";

    }
public Guru(int id, String nama, String alamat, String Mapel){
this.id = id;
this.nama = nama;
this.alamat = alamat;
this.Mapel = Mapel;
}

public void print(){
System.out.println("------------------------");
System.out.println("ID :"+ id);
System.out.println("Nama :"+ nama);
System.out.println("alamat :"+ alamat);
System.out.println("mapel :"+ Mapel);

}

}

//Object Class
public class Siswa {
    int id;
    String nama;
    double ipk;
    
    //Constructor
    public Siswa() {
        id = 0;
        nama = "";
        ipk = 0;
      }

      //constructer parameter 
      public Siswa (int id, String nama, double ipk) {
      this.id = id;
      this.nama = nama;
      this.ipk = ipk;   
      }
      //metode
      public void print() {
        System.out.println("Iki data tekok emboh sopoh");
        System.out.println("ID :" + id);
        System.out.println("Jeneng :" + nama);
        System.out.println("IPK :" +ipk);
      }
}
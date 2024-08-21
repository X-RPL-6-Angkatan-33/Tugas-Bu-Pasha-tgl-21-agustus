// Driver Class
import java.util.Scanner;
public class TesSiswa {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Nama :");
    String nama = in.nextLine();
    System.out.println("Id :");
    int id = in.nextInt();
    System.out.println("IPK :");
    double ipk = in.nextDouble();
    //membuat obyek
   Siswa Agus = new Siswa();
   Siswa Samsul = new Siswa();

   Siswa joko = new Siswa(10, "Joko", 40);
   Siswa sutrisno = new Siswa(id,nama,ipk);
    Agus.id = 101;
    Agus.nama = "Agus";
    Agus.ipk = 8;
    System.out.println("Ikiloh datane cak agus!!");
   System.out.println(Agus.id);
   System.out.println(Agus.nama);
   System.out.println(Agus.ipk);
   System.out.println("Ikiloh datane cak samsul!!");
   System.out.println(Samsul.id);
   System.out.println(Samsul.nama);
   System.out.println(Samsul.ipk);
}
}

//Driver Tes Guru

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

@SuppressWarnings("unused")
public class InnerTesGuru {
public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("Nama");
        String nama = in.next();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();
    }
    System.out.println("");

    Guru buPasha = new Guru();
    Guru buAul = new Guru();
    Guru pakAyat = new Guru();
    Guru pakAndre = new Guru();
    Guru pakDiaur = new Guru();

    buPasha.id = 01;
    buPasha.nama = "Bu Pasha";
    buPasha.Mapel = "Produktif RPL";
    buPasha.alamat = "Malang";

    System.out.println("Berikut Datanya Bu Pasha");
    System.out.println(buPasha.id);
    System.out.println(buPasha.nama);
    System.out.println(buPasha.Mapel);
    System.out.println(buPasha.alamat);

    buAul.id = 02;
    buAul.nama = "Bu Aulia";
    buAul.Mapel = "Produktif RPL";
    buAul.alamat = "Malang";

    System.out.println("Berikut Datanya Bu Aul");
    System.out.println(buAul.id);
    System.out.println(buAul.nama);
    System.out.println(buAul.Mapel);
    System.out.println(buAul.alamat);

    pakAyat.id = 03;
    pakAyat.nama = "Pak Ayat";
    pakAyat.Mapel = "Informatika";
    pakAyat.alamat = "Malang";

    System.out.println("Berikut Datanya Pak Ayat");
    System.out.println(pakAyat.id);
    System.out.println(pakAyat.nama);
    System.out.println(pakAyat.Mapel);
    System.out.println(pakAyat.alamat);

    pakAndre.id = 04;
    pakAndre.nama = "Pak Andre";
    pakAndre.Mapel = "B.Ing";
    pakAndre.alamat = "Malang";

    System.out.println("Berikut Datanya Pak Andre");
    System.out.println(pakAndre.id);
    System.out.println(pakAndre.nama);
    System.out.println(pakAndre.Mapel);
    System.out.println(pakAndre.alamat);

    pakDiaur.id = 05;
    pakDiaur.nama = "Pak Diaur";
    pakDiaur.Mapel = "IPAS dan PJOK";
    pakDiaur.alamat = "Malang";

    System.out.println("Berikut Datanya Pak Diaur");
    System.out.println(pakDiaur.id);
    System.out.println(pakDiaur.nama);
    System.out.println(pakDiaur.Mapel);
    System.out.println(pakDiaur.alamat);

    buPasha.print();
    buAul.print();
    pakAyat.print();
    pakAndre.print();
    pakDiaur.print();
}


}
    



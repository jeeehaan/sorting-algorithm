//program untuk membuat angka random dalam range tertentu tanpa duplikasi
import java.io.*;
import java.util.Random;
public class RandomNumber {
    // int[] tes = new int[5001]; //jumlah data
    // int kode;
    public static void main(String[] args) 
    {
        int[] tes = new int[50001]; //jumlah data
        int kode;

        Random coba = new Random();

        for (int i = 1; i <= 50000; i++) { //range
            boolean isEqual=false;
            kode = coba.nextInt(50001); //jumlah data
            tes[i] =  kode;
            for (int j = 0; j < i; j++) {
                if(kode == tes[j]){
                isEqual=true;
                i--;
                break;
                }
            }

            if(isEqual==true){
                continue;
            } else {
            System.out.println(kode);
            }

        }


        //PrintWriter untuk mencetak ke TXT
        // try {
        //     File data = new File("d/data.txt"); //nama file atau direktori spt "folder/data.txt"
        //     PrintWriter pr = new PrintWriter(new FileWriter(data,false));
        //     //parameter 1 : Objek File
        //     //parameter 2 : Append, jika false maka file lama akan ditimpa
        //     pr.println(kode+"#");
        //     pr.close();// wajib, menutup koneksi I/O agar file tidak corrupt
        //     System.out.println("saved to data.txt!");
        // } catch(Exception e)
        // {
        //     System.out.println("tidak dapat dicetak");
        // }
    }
}
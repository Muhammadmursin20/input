import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * class Main.
 *
 * @autho Muhammadmursin
 * @version 0.1
 */
public class Main
{
    public static void main(String args[])

    {
        ArrayList<String> als = new ArrayList<String>();
        ArrayList<String> alsi= new ArrayList<String>();

        // ArrayList dengan custom Object
        ArrayList<Mahasiswa> arraylistMhs= new ArrayList<Mahasiswa>();
        int nim=0;
        String nama=null, alamat=null, jk=null;
        
        
        // create an object of Scanner
        Scanner input = new Scanner(System.in);
    
        //  Input jumlah Data yang di inginkan oleh User
        System.out.print("Input jumlah Mahasiswa : ");   
        int jlh_data = input.nextInt();
         
        //  Input Data dan masukkan ke dalam objek ArrayList yang telah Anda buat
        for(int a = 0; a < jlh_data; a++)
        {
            int in = a+1;
            System.out.print("Masukkan NIM Mahasiswa ke - "+ in +" = ");
            nim = input.nextInt();
            System.out.print("Masukkan Nama Mahasiswa ke - "+ in +" = ");
            nama = input.next();
            System.out.print("Masukkan alamat Mahasiswa ke - "+ in +" = ");
            alamat = input.next();
            System.out.print("Masukkan Jenis Kelamin Mahasiswa ke - "+ in +" = ");
            jk = input.next();
            
         arraylistMhs.add(new Mahasiswa(nim, nama, alamat, jk));
            
        }
        
        System.out.println("\n");
        System.out.println("Daftar Mahasiswa");
        for(Mahasiswa mhs:arraylistMhs)
        {

            System.out.println("NIM = "+ mhs.getnimMhs());
            System.out.println("Nama = "+mhs.getnamaMhs());
            System.out.println("Alamat = "+mhs.getalamatMhs());
            System.out.println("Jenis Kelamin = "+mhs.getjkMhs()+"\n");

        }
        
        System.out.println("Update Data Mahasiswa");
        int cariNim;
        System.out.print("Cari NIM = ");
        cariNim = input.nextInt();
        for(Mahasiswa mhs:arraylistMhs)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        System.out.print("Set Nama = ");    
        nama = input.next();
        mhs.setnamaMhs(nama);
        }

        }
        System.out.println("\n");   
        System.out.println("Data Mahasiswa Setelah di Update");
        for(Mahasiswa mhs:arraylistMhs)
        {
            System.out.println("NIM = "+ mhs.getnimMhs());
            System.out.println("Nama = "+mhs.getnamaMhs());
            System.out.println("Alamat = "+mhs.getalamatMhs());
            System.out.println("Jenis Kelamin = "+mhs.getjkMhs()+"\n");
        }
       
       System.out.println("\nRemove Data Mahasiswa");
        System.out.print("Masukkan NIM = ");
        cariNim = input.nextInt();
        for(Mahasiswa mhs:arraylistMhs)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        arraylistMhs.indexOf(mhs);
        arraylistMhs.remove(arraylistMhs.indexOf(mhs));
        break;
        }
        }
        
        System.out.println("\nData Mahasiswa Setelah di Hapus");
        for(Mahasiswa mhs:arraylistMhs)
        {
            System.out.println("NIM = "+ mhs.getnimMhs());
            System.out.println("Nama = "+mhs.getnamaMhs());
            System.out.println("Alamat = "+mhs.getalamatMhs());
            System.out.println("Jenis Kelamin = "+mhs.getjkMhs()+"\n");
        } 
        
        System.out.println("Search Data Mahasiswa");
        System.out.print("Cari NIM = ");
        cariNim = input.nextInt();
        for(Mahasiswa mhs:arraylistMhs)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        System.out.println("NIM = "+ mhs.getnimMhs());
        System.out.println("Nama = "+mhs.getnamaMhs());
        System.out.println("Alamat = "+mhs.getalamatMhs());
        System.out.println("Jenis Kelamin = "+mhs.getjkMhs()+"\n");
        }

        }
       
        /*System.out.println("Remove Data Mahasiswa");
        System.out.print("Cari NIM = ");
        cariNim = input.nextInt();
        for(Mahasiswa mhs:arraylistMhs)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        System.out.println(mhs.indexOf());
        }
        }
         
        
        
        int jumlahMhs = input.nextInt();
        
        //  Tampilkan nilai yang di simpan di dalam ArrayList
        System.out.println("\nTampilkan Data yang di input");
        for(Object o : arraylistMhs)
        {
            System.out.println(o);
        }
        
        for(int i=0; i<=jumlahMhs; i++)
        {
        System.out.println("masukkan nama mahasiswa ke " );
        String nama = input.next();
        }*/
        // take input from the user
        /*String nama = input.next();
        int nim = input.nextInt();

        // nextInt()
        als.add(nama);
        als.add(nama);
        als.add("Ayu");
        als.add("ggg");*/
 

        System.out.println(als);
        System.out.println("\nMemeriksa apakah array list kosong: ");
        System.out.println(arraylistMhs.isEmpty()); 
        
        System.out.println("\nMemeriksa ada berapa array list: ");
        System.out.println(arraylistMhs.size());
        /*als.remove("Budi");
        System.out.println("Setelah diremove");
        System.out.println(als);

        als.add("Budi");
        Collections.sort(als);
        System.out.println("Setelah disort");
        System.out.println(als);

        alsi.add(0,"Doni");
        alsi.add(1,"Ayu");
        alsi.add(2,"Budi");
        System.out.println(alsi);
        alsi.remove(1);
        System.out.println(alsi);

        alsi.set(1,"Imran");
        System.out.println(alsi);
        System.out.println(alsi.indexOf("Doni"));
        alsi.add("Muh. Imran");
        System.out.println(alsi);
        System.out.println(alsi.contains("Imran"));

        arraylistMhs.add(new Mahasiswa(2020002,"Katami","cot preh","pistol"));
        arraylistMhs.add(new Mahasiswa(2020003,"Fikram","cot mentiwan","pistol"));
        arraylistMhs.add(new Mahasiswa(2020004,"Reski","cot preh","pistol"));

        System.out.println("Sebelum diedit");
        for(Mahasiswa mhs:arraylistMhs)
        {

            System.out.println(mhs.getnimMhs() +" "+ mhs.getnamaMhs()+" "+ mhs.getalamatMhs()+" "+ mhs.getjkMhs());;

        }
        
        System.out.println("Setelah diedit");
        for(Mahasiswa mhs:arraylistMhs)
        {
        if (mhs.getnimMhs() == 2020003)
        {
        mhs.setnamaMhs("Rudi");
        }

        System.out.println(mhs.getnimMhs() +" "+ mhs.getnamaMhs());

        }*/
    } 
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ryand
 */
public class Database {
    private String databaseName = "2210010456";
    private String username = "root";
    private String password = "";
    private String location = "jdbc:mysql://localhost/" + databaseName;
    public static Connection connectionDB;
    
    public Database(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connectionDB = DriverManager.getConnection(location, username, password);
            System.out.println("connected");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void tambahUji(String nik, String nama, String telp, String alamat){
        try{
            String sql = "INSERT INTO uji (nik,nama,telp,alamat) VALUE (?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.setString(2, nama);
            perintah.setString(3, telp);
            perintah.setString(4, alamat);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void tambahPasien(int id_Pasien, String username_Pasien, String password_Pasien, String nama_Pasien,
            String tglLahir_Pasien, String jenisKelamin_Pasien, String alamat_Pasien){
        try{
            String sql = "INSERT INTO pasien (id_pas,username_pas,pass_pas,nama_pas,lahir_pas,jk_pas,alamat_pas) VALUE (?,?,?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_Pasien);
            perintah.setString(2, username_Pasien);
            perintah.setString(3, password_Pasien);
            perintah.setString(4, nama_Pasien);
            perintah.setString(5, tglLahir_Pasien);
            perintah.setString(6, jenisKelamin_Pasien);
            perintah.setString(7, alamat_Pasien);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void tambahRiwayat(int id_Riwayat, int id_Dokter, int id_RumahSakit, int id_Pasien,
    String keluhanPasien, String obatPasien, String fileRiwayat, String dateRiwayat){
        try{
            String sql = "INSERT INTO riwayat (id_rw,id_dok,id_rs,id_pas,keluhan_riw,obat_riw,file_riw,date_riw) VALUE (?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_Riwayat);
            perintah.setInt(2, id_Dokter);
            perintah.setInt(3, id_RumahSakit);
            perintah.setInt(4, id_Pasien);
            perintah.setString(5, keluhanPasien);
            perintah.setString(6, obatPasien);
            perintah.setString(7, fileRiwayat);
            perintah.setString(8, dateRiwayat);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void tambahDokter(int id_dokter, String username_dokter, String pass_dok, String nama_dok,int id_rs_multi){
        try{
            String sql = "INSERT INTO dokter (id_dok,username_dok,pass_dok,nama_dok,id_rs_multi) VALUE (?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_dokter);
            perintah.setString(2, username_dokter);
            perintah.setString(3, pass_dok);
            perintah.setString(4, nama_dok);
            perintah.setInt(5, id_rs_multi);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void tambahRM(int id_rm, int id_pas, String judul_rm, String tgl_rm,String file_rm,String ket_rm){
        try{
            String sql = "INSERT INTO rm (id_rm,id_pas,judul_rm,tgl_rm,file_rm,ket_rm) VALUE (?,?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_rm);
            perintah.setInt(2, id_pas);
            perintah.setString(3, judul_rm);
            perintah.setString(4, tgl_rm);
            perintah.setString(5, file_rm);
            perintah.setString(5, ket_rm);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void tambahRS(int id_rs, String nama_rs, String alamat_rs){
        try{
            String sql = "INSERT INTO rs (id_rs,nama_rs,alamat_rs) VALUE (?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_rs);
            perintah.setString(2, nama_rs);
            perintah.setString(3, alamat_rs);
            
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    public void ubahUji(String nik, String nama, String telp, String alamat){
        try{
            String sql = "UPDATE uji SET nama=?, telp=?, alamat=? where nik=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, telp);
            perintah.setString(3, alamat);
            perintah.setString(4, nik);
            
            perintah.executeUpdate();
            System.out.println("updated");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPasien(int id_Pasien, String username_Pasien, String password_Pasien, String nama_Pasien,
            String tglLahir_Pasien, String jenisKelamin_Pasien, String alamat_Pasien){
        try{
            String sql = "UPDATE pasien SET username_pas=?,pass_pas=?,nama_pas=?,lahir_pas=?,jk_pas=?,alamat_pas=? WHERE id_pas=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, username_Pasien);
            perintah.setString(2, password_Pasien);
            perintah.setString(3, nama_Pasien);
            perintah.setString(4, tglLahir_Pasien);
            perintah.setString(5, jenisKelamin_Pasien);
            perintah.setString(6, alamat_Pasien);
            perintah.setInt(7, id_Pasien);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahRiwayat(int id_Riwayat, int id_Dokter, int id_RumahSakit, int id_Pasien,
    String keluhanPasien, String obatPasien, String fileRiwayat, String dateRiwayat){
        try{
            String sql = "UPDATE riwayat SET id_rw=?,id_dok=?,id_rs=?,id_pas=?,keluhan_riw=?,obat_riw=?,file_riw=?,date_riw=? WHWRE id_rw=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_Dokter);
            perintah.setInt(2, id_RumahSakit);
            perintah.setInt(3, id_Pasien);
            perintah.setString(4, keluhanPasien);
            perintah.setString(5, obatPasien);
            perintah.setString(6, fileRiwayat);
            perintah.setString(7, dateRiwayat);
            perintah.setInt(8, id_Riwayat);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahDokter(int id_dokter, String username_dokter, String pass_dok, String nama_dok,int id_rs_multi){
        try{
            String sql = "UPDATE dokter SET username_dok=?,pass_dok=?,nama_dok=?,id_rs_multi=? WHERE id_dok=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, username_dokter);
            perintah.setString(2, pass_dok);
            perintah.setString(3, nama_dok);
            perintah.setInt(4, id_rs_multi);
            perintah.setInt(5, id_dokter);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahRM(int id_rm, int id_pas, String judul_rm, String tgl_rm,String file_rm,String ket_rm){
        try{
            String sql = "UPDATE rm SET id_pas=?,judul_rm=?,tgl_rm=?,file_rm=?,ket_rm=? WHERE id_rm=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_pas);
            perintah.setString(2, judul_rm);
            perintah.setString(3, tgl_rm);
            perintah.setString(4, file_rm);
            perintah.setString(5, ket_rm);
            perintah.setInt(6, id_rm);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahRS(int id_rs, String nama_rs, String alamat_rs){
        try{
            String sql = "UPDATE rs SET nama_rs=?,alamat_rs=? WHERE id_rs=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_rs);
            perintah.setString(2, alamat_rs);
            perintah.setInt(3, id_rs);
            
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    public void hapusUji(String nik){
        try{
            String sql = "delete from uji where nik = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nik);
            
            perintah.executeUpdate();
            System.out.println("deleted");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPasien(int id_Pasien){
        try{
            String sql = "DELETE FROM pasien WHERE id_pas=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_Pasien);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusRiwayat(int id_Riwayat){
        try{
            String sql = "DELETE FROM pasien WHERE id_rw=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_Riwayat);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusDokter(int id_dokter){
        try{
            String sql = "DELETE FROM dokter WHERE id_dok=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_dokter);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusRM(int id_rm){
        try{
            String sql = "DELETE FROM rm  WHERE id_rm=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_rm);
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusRS(int id_rs){
        try{
            String sql = "DELETE FROM rs WHERE id_rs=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_rs);
            
            perintah.executeUpdate();
            
            System.out.println("added");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    public void cariPasien(int id_pas){
        try{
            String sql = "SELECT * FROM pasien WHERE id_pas=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_pas);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID Pasien : "+data.getString("id_pas"));
                System.out.println("username Pasien : "+data.getString("username_pasien"));
                System.out.println("Password Pasien : "+data.getString("pass_pas"));
                System.out.println("Nama Pasien : "+data.getString("nama_pas"));
                System.out.println("Tanggal Lahir Pasien : "+data.getString("lahir_pas"));
                System.out.println("Jenis Kelamin Pasien : "+data.getString("jk_pas"));
                System.out.println("Alamat Pasien : "+data.getString("alamat_pas"));
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void cariRiwayat(int id_rw){
        try{
            String sql = "SELECT * FROM riwayat WHERE id_rw=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_rw);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID Riwayat : "+data.getString("id_rw"));
                System.out.println("ID Dokter : "+data.getString("id_dok"));
                System.out.println("ID Rumah Sakit : "+data.getString("id_rs"));
                System.out.println("ID Pasien : "+data.getString("id_pas"));
                System.out.println("keluhan riwayat : "+data.getString("keluhan_riw"));
                System.out.println("obat riwayat : "+data.getString("obat_riw"));
                System.out.println("file riwayat : "+data.getString("file_riw"));
                System.out.println("tanggal riwaya=t : "+data.getString("date_riw"));
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void cariDokter(int id_dok){
        try{
            String sql = "SELECT * FROM dokter WHERE id_dok=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_dok);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID Dokter : "+data.getString("id_dok"));
                System.out.println("username dokter : "+data.getString("username_dok"));
                System.out.println("password dokter : "+data.getString("pass_dok"));
                System.out.println("nama dokter : "+data.getString("nama_dok"));
                System.out.println("id rumah sakit multi  : "+data.getString("id_rs_multi"));
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void cariRM(int id_rm){
        try{
            String sql = "SELECT * FROM rm WHERE id_rm=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_rm);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID RM : "+data.getString("id_rm"));
                System.out.println("ID Pasien : "+data.getString("id_pas"));
                System.out.println("Judul RM : "+data.getString("judul_rm"));
                System.out.println("Tanggal RM : "+data.getString("tgl_rm"));
                System.out.println("File RM : "+data.getString("file_rm"));
                System.out.println("Keterangan RM : "+data.getString("ket_rm"));
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void cariRS(int id_rs){
        try{
            String sql = "SELECT * FROM rs WHERE id_rs=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_rs);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID Rumah Sakit : "+data.getString("id_rs"));
                System.out.println("Nama Rumah Sakit : "+data.getString("nama_rs"));
                System.out.println("alamat Rumah Sakit : "+data.getString("alamat_rs"));
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    public void dataPasien(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM pasien ORDER BY id_pas ASC");
            
            while(baris.next()){
                System.out.println(baris.getString("id_pas")
                +" | "+baris.getString("username_pas")
                +" | "+baris.getString("pass_pas")
                +" | "+baris.getString("nama_pas")
                +" | "+baris.getString("lahir_pas")
                +" | "+baris.getString("jk_pas")
                +" | "+baris.getString("alamat_pas")
                );
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
    
    public void dataRiwayat(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM riwayat ORDER BY id_rw ASC");
            
            while(baris.next()){
                System.out.println(baris.getString("id_rw")
                +" | "+baris.getString("id_dok")
                +" | "+baris.getString("id_rs")
                +" | "+baris.getString("id_pas")
                +" | "+baris.getString("keluhan_riw")
                +" | "+baris.getString("obat_riw")
                +" | "+baris.getString("file_riw")
                +" | "+baris.getString("date_riw")
                );
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
    
    public void dataDokter(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM dokter ORDER BY id_dok ASC");
            
            while(baris.next()){
                System.out.println(baris.getString("id_dok")
                +" | "+baris.getString("username_dok")
                +" | "+baris.getString("pass_dok")
                +" | "+baris.getString("nama_dok")
                +" | "+baris.getString("id_rs_multi")
                );
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
    
    public void dataRM(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM rm ORDER BY id_rm ASC");
            
            while(baris.next()){
                System.out.println(baris.getString("id_rm")
                +" | "+baris.getString("id_pas")
                +" | "+baris.getString("judul_rm")
                +" | "+baris.getString("tgl_rm")
                +" | "+baris.getString("file_rm")
                +" | "+baris.getString("ket_rm")
                );
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
    
    public void dataRS(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM rs ORDER BY id_rs ASC");
            
            while(baris.next()){
                System.out.println(baris.getString("id_rs")
                +" | "+baris.getString("nama_rs")
                +" | "+baris.getString("alamat_rs")
                );
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
    
}

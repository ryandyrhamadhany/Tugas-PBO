/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Riwayat;

/**
 *
 * @author ryand
 */
public class pasien extends riwayat{
    int id_Pasien;
    String username_Pasien, password_Pasien, nama_Pasien, tglLahir_Pasien, 
            jenisKelamin_Pasien, alamat_Pasien;
    
    public pasien (){}
    public pasien (int id_Pasien, String username_Pasien, String password_Pasien, String nama_Pasien,
            String tglLahir_Pasien, String jenisKelamin_Pasien, String alamat_Pasien){
        this.id_Pasien = id_Pasien;
        this.username_Pasien = username_Pasien;
        this.password_Pasien = password_Pasien;
        this.nama_Pasien = nama_Pasien;
        this.tglLahir_Pasien = tglLahir_Pasien;
        this.jenisKelamin_Pasien = jenisKelamin_Pasien;
        this.alamat_Pasien = alamat_Pasien;
    }
    
    public void inputIDPasien(int id){
        this.id_Pasien = id;
    }
    
    public int ambilIDPasien(){
        return this.id_Pasien;
    }
    
    public void inputUsernamePasien(String username){
        this.username_Pasien = username;
    }
    
    public String ambilUsernamePasien(){
        return this.username_Pasien;
    }
    
    public void inputPasswordPasien(String pass){
        this.password_Pasien = pass;
    }
    
    public String ambilPasswordPasien(){
        return this.password_Pasien;
    }
    
    public void inputNamaPasien(String nama){
        this.nama_Pasien = nama;
    }
    
    public String ambilNamaPasien(){
        return this.nama_Pasien;
    }
    
    public void inputTanggalLahirPasien(String tanggal){
        this.tglLahir_Pasien = tanggal;
    }
    
    public String ambilTanggalLahirPasien(){
        return this.tglLahir_Pasien;
    }
    
    public void inputJenisKelamin(String jk){
        this.jenisKelamin_Pasien = jk;
    }
    
    public String ambilJenisKelamin(){
        if(this.jenisKelamin_Pasien.equals("L")){
            return this.jenisKelamin_Pasien = "Laki Laki";
        }else if(this.jenisKelamin_Pasien.equals("P")){
            return this.jenisKelamin_Pasien = "Perempuan";
        }else{
            return "input yang anda masukan salah!!";
        }
    }
    
    public void inputAlamatPasien(String alamat){
        this.alamat_Pasien = alamat;
    }
    
    public String ambilAlamatPasien(){
        return this.alamat_Pasien;
    }
    
}

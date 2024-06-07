/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Riwayat;

/**
 *
 * @author ryand
 */
public class riwayat {
    int id_Riwayat, id_Dokter, id_RumahSakit, id_Pasien;
    String keluhanPasien, obatPasien, fileRiwayat, dateRiwayat;
    
    public riwayat(){}
    public riwayat(int id_Riwayat, int id_Dokter, int id_RumahSakit, int id_Pasien,
    String keluhanPasien, String obatPasien, String fileRiwayat, String dateRiwayat){
        this.id_Riwayat = id_Riwayat;
        this.id_Dokter = id_Dokter;
        this.id_RumahSakit = id_RumahSakit;
        this.id_Pasien = id_Pasien;
        
        this.keluhanPasien = keluhanPasien;
        this.obatPasien = obatPasien;
        this.fileRiwayat = fileRiwayat;
        this.dateRiwayat = dateRiwayat;
    }
    
    public void inputIDRiwayat(int riwayat){
        this.id_Riwayat = riwayat;
    }
    
    public int ambilIDRiwayat(){
        return id_Riwayat;
    }
    
    public void inputIDDokter(int dokter){
        this.id_Dokter = dokter;
    }
    
    public int ambilIDDokter(){
        return id_Dokter;
    }
    
    public void inputIDRumahSakit(int rumahSakit){
        this.id_RumahSakit = rumahSakit;
    }
    
    public int ambilIDRumahSakit(){
        return id_RumahSakit;
    }
    
    public void inputIDPasien(int pasien){
        this.id_Pasien = pasien;
    }
    
    public int ambilIDPasien(){
        return id_Pasien;
    }
    
    public void inputKeluhanPasien(String keluhan){
        this.keluhanPasien = keluhan;
    }
    
    public String ambilKeluhanPasien(){
        return keluhanPasien;
    }
    
    public void inputObatPasien(String obat){
        this.obatPasien = obat;
    }
    
    public String ambilObatPasien(){
        return obatPasien;
    }
    
    public void inputFileRiwayat(String file){
        this.fileRiwayat = file;
    }
    
    public String ambilfileRiwayat(){
        return fileRiwayat;
    }
    
    public void inputDateRiwayat(String date){
        this.dateRiwayat = date;
    }
    
    public String ambilDateRiwayat(){
        return dateRiwayat;
    }
    
}

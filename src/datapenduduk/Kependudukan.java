
package datapenduduk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class Kependudukan {
    String id,nik,nama,jeniskelamin, alamat, rt, rw, agama, kewarganegaraan;
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
 public void setId(String id){
      this.id = id;
 }
  public void setNik(String nik){
      this.nik = nik;
  }
 public void setNama(String nama){
      this.nama = nama;
 }
  public void setAlamat(String alamat){
      this.alamat = alamat;
  }
  public void setJenisK(String jeniskelamin){
      this.jeniskelamin = jeniskelamin;
  }
 public void setRT(String rt){
      this.rt = rt;
  }
 public void setRW(String rw){
      this.rw = rw;
  }
 public void setAgama(String agama){
      this.agama = agama;
  }
  public void setKewarganegaraan(String kewarganegaraan){
      this.kewarganegaraan = kewarganegaraan;
  }
}
 
 
 

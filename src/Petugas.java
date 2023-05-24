
import java.util.ArrayList;


public class Petugas implements User{
   

 private ArrayList<String> namaPetugas = new ArrayList<String>();
 private ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();

 public Petugas() {
 this.namaPetugas.add("Admin");
 this.alamat.add("Kedung kandang");
 this.telepon.add("0812345654");
 }

 public int getJmlPetugas(){
 return this.namaPetugas.size();
 }
 @Override
 public void setNama(String namaPetugas ){
 this.namaPetugas.add(namaPetugas);
 }

 @Override
 public void setAlamat(String alamat ){
 this.namaPetugas.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.namaPetugas.add(telepon);
 }

 @Override
 public String getNama(int idPetugas){
 return this.namaPetugas.get(idPetugas);
 }

 @Override
 public String getAlamat(int idPetugas){
 return this.alamat.get(idPetugas);
 }

 @Override
 public String getTelepon(int idPetugas){
 return this.telepon.get(idPetugas);
 }

   
}
        

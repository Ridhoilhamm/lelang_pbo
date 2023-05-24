
import java.util.ArrayList;


public class Masyarakat implements User{


    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
 
    public Masyarakat() {
        this.namaMasyarakat.add("Ridho Ilham ");
        this.alamat.add("Jombang");
        this.telepon.add("08970915625");

        this.namaMasyarakat.add("Reno Aditya");
        this.alamat.add("Jombang");
        this.telepon.add("08909678123");
        
    } 
    public int getJmlMasyarakat(){
        return this.namaMasyarakat.size();
    } 
    @Override
    public void setNama(String namaMasyarakat){
        this.namaMasyarakat.add(namaMasyarakat);
    }

    @Override
    public void setAlamat(String alamat ){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMasyarakat){
        return this.namaMasyarakat.get(idMasyarakat);
    }

    @Override
    public String getAlamat(int idMasyarakat){
        return this.alamat.get(idMasyarakat);
    }

    @Override
    public String getTelepon(int idMasyarakat){
        return this.telepon.get(idMasyarakat);
    } 

    
}
   
    


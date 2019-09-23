public class Person{
    String nim;
    String nama;
    String alamat;

    public static void main(String[]args) {

        System.out.println("Person");
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getNim(){
        return this.nim; 
    }
    public String getNama(){
        return this.nama;
    }
    public String getAlamat(){
        return this.alamat;
    }
    


}
class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();
        
        m.setNama("Kucing"); //nama bersifat private, tidak bisa diakses langsung jadi diganti menggunakan setter

        
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        
        MakhlukHidup m3 = new MakhlukHidup(m2);
 
        System.out.println(m.getInfo());
        
        System.out.println(m2.getInfo());
        
        m2.Makhluk("Kuda"); // bukan method, tapi constructor jadi ubah nama menggunakan method setter:
                
        System.out.println(m2.getInfo()); 
        
        m3.setUmur(10); //umur tidak boleh negatif sehingga perlu di validasi:
        
        System.out.println(m3.getInfo());

}
}

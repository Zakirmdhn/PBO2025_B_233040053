package pertemuan3;

public class mainMahasiswa {
	public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa("233040047", 3, true);
        

        // m1.nim = "233040047";
        // m1.ipk = 3.08;

        System.out.println(m1.nim);
        System.out.println(m1.ipk);
        System.out.println(m1.statusPerwalian);
        m1.perwalian();
        System.out.println(m1.statusPerwalian);
        
    }
}

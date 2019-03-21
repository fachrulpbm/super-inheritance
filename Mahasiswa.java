public class Mahasiswa extends Person{
	
	private String nim;

	public Mahasiswa(String nim, String nama, String alamat){
		super(nama, alamat);
		this.nim = nim;
	}

	public void showMahasiswa(){
		System.out.println("Mahasiswa");
		System.out.println("Nim: "+nim);
		System.out.println("Nama: "+super.getNama());
		System.out.println("Alamat: "+super.getAlamat());
	}

}
public class Person{
	
	private String nama;
	private String alamat;

	public Person(String nama, String alamat){
		this.nama = nama;
		this.alamat = alamat;
	}

	//accessor
	public String getNama(){
		return nama;
	}

	//accessor
	public String getAlamat(){
		return alamat;
	}

	public void showPerson(){
		System.out.println("Person");
		System.out.println("Nama: "+nama);
		System.out.println("Alamat: "+alamat);
	}

}
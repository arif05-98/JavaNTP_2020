
public class Kurucular {
	public int a;
	public String ad;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kurucular nesne=new Kurucular();
		System.out.println("Default kurucu i�in a:"+ nesne.a);
		System.out.println("Default kurucu i�in ad:"+ nesne.ad);
		System.out.println("-----------------");
		Kurucular nesne2=new Kurucular(100);
		System.out.println("Default kurucu i�in a:"+ nesne2.a);
		System.out.println("Default kurucu i�in ad:"+ nesne2.ad);
		System.out.println("-----------------");
		Kurucular nesne3=new Kurucular("�STE");
		System.out.println("Default kurucu i�in a:"+ nesne3.a);
		System.out.println("Default kurucu i�in ad:"+ nesne3.ad);
		System.out.println("-----------------");
		Kurucular nesne4=new Kurucular(1453, "�STE-BM");
		System.out.println("Default kurucu i�in a:"+ nesne4.a);
		System.out.println("Default kurucu i�in ad:"+ nesne4.ad);
		System.out.println("-----------------");
		Kurucular nesne5=new Kurucular("--�STE-BM--", 1071);
		System.out.println("Default kurucu i�in a:"+ nesne5.a);
		System.out.println("Default kurucu i�in ad:"+ nesne5.ad);
		
		System.out.println("String");
		System.out.println(45);
		
	}
	
	Kurucular() {
		// TODO Auto-generated constructor stub
		this.a=-1;
		this.ad="Varsay�lan";
	}
	Kurucular(int a){
		this(); //Parametresiz kurucu
		this.a=a;
		this.ad="-Varsay�lan-";
		
	}
	Kurucular(String ad){
		this(5);//int parametreli constructer cagirildi
		this.ad=ad;
		this.a=-2;
	}
	Kurucular(int a, String ad){
		this.ad=ad;
		this.a=a;
	}
	Kurucular(String ad, int a){
		this.ad=ad;
		this.a=a;
	}
	
	//Yikici fonksiyon: Deconstructer
	public void finalize(){
		System.out.println("DeConstructer tetiklendi");
	}

}

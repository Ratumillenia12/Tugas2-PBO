public class nomor2{
	int totalDetik, detikSekarang,totalMenit, menitSekarang, totalJam, jamSekarang;

	public nomor2(){
		totalDetik = 1203186020;
		detikSekarang = totalDetik%60;
		totalMenit = totalDetik/60;
		menitSekarang = totalMenit%60;
		totalJam = totalMenit/60;
		jamSekarang = totalJam%24;
	}
public static void main(String[] args)
{
	nomor2 b2 = new nomor2();
	
	System.out.println((b2.jamSekarang)+" : "+(b2.menitSekarang)+" : "+(b2.detikSekarang));
	}
}
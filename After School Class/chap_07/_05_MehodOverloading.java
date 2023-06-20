package chap07;

public class _05_MehodOverloading {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "Blacky";
		
		b1.record(false, false, 10);
		b1.record(true, false, 5);
		b1.record(false, true, 15);
		b1.record(true, true, 7);		
		
		b1.record(7);
		b1.record();
		
	}
	
}

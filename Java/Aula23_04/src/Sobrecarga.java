
public class Sobrecarga {

	public void algo() {
		System.out.println("M�todo algo");
	}
	
	public int algo(int x, int y) {
		return 1;
	}
	
	public void algo(int x) {
		System.out.println("Outro m�todo algo" + x);
	}
	
	protected void algo(String x) {
		System.out.println("Outro m�todo algo" + x);
	}
	
	public void algo(double y) throws Exception {
		throw new Exception("...");
	}
}

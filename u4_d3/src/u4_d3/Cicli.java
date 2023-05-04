package u4_d3;

public class Cicli {

	public static void main(String[] args) {

		System.out.println(stringaPariDispari("Francesco"));
		System.out.println(annoBisestile(1700));
	}

	public static boolean stringaPariDispari(String p) {

		int f = p.length();
		if (f % 2 == 0) {

			return true;

		} else {
			return false;
		}

	}

	public static boolean annoBisestile(int anno) {

		if (anno % 4 == 0)  {

			return true;
		} else if ( anno % 100 == 0  &&  anno % 400 == 0 	) {
		    return true;
		} else {
			return false;
		}

		
	}

}

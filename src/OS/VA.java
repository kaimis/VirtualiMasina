package OS;

/**
 * Vartotojo atmintis
 * @author Aurimas
 *
 */
public class VA {
	/**
	 * Vartotojui išskiriamos atminties kiekis
	 */
	private int vartotojoAtmintis=0;
	
	
	/**
	 * Konstruktoriai
	 */
	public VA() {
		this(100);
	}
	VA(int vartotojoAtmintis) {
		this.vartotojoAtmintis = vartotojoAtmintis;
	}
}

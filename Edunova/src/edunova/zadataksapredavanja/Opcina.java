package edunova.zadataksapredavanja;

public class Opcina extends Zupanija{

	private Zupanija zupanija;
	private String naziv;
	
	
	
	
	public Opcina() {
		super();
	}
	public Opcina(String zupan, Zupanija zupanija, String naziv) {
		super(zupan);
		this.zupanija = zupanija;
		this.naziv = naziv;
	}
	public Zupanija getZupanija() {
		return zupanija;
	}
	public void setZupanija(Zupanija zupanija) {
		this.zupanija = zupanija;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
	
}

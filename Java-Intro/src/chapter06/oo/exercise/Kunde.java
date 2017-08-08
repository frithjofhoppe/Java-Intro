package chapter06.oo.exercise;

public class Kunde extends Person {

	boolean vip;
	
	Kunde(String vorname, String nachname,boolean vip) {
		super(vorname, nachname);
		this.vip = vip;
	}
	
	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	
	public String getNames()
	{
		return super.getNames() + " VIP:"+isVip();
	}
}

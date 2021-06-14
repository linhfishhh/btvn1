package btvn1;

public class nvienfulltime extends Person {
	private int tienthuong;
	private int tienphat;
	private int luongcung;
	public nvienfulltime() {
		
	}
	public nvienfulltime(String name, int age, int sdt, String email, int id,int tienthuong, int tienphat, int luongcung) {
		super(name, age, sdt, email, id);
		this.tienthuong=tienthuong;
		this.tienphat=tienphat;
		this.luongcung=luongcung;
	}
	public nvienfulltime(int tienthuong, int tienphat, int luongcung) {
		this.tienthuong=tienthuong;
		this.luongcung=luongcung;
		this.tienphat=tienphat;
	}
	public int getTienthuong() {
		return tienthuong;
	}
	public void setTienthuong(int tienthuong) {
		this.tienthuong = tienthuong;
	}
	public int getTienphat() {
		return tienphat;
	}
	public void setTienphat(int tienphat) {
		this.tienphat = tienphat;
	}
	public int getLuongcung() {
		return luongcung;
	}
	public void setLuongcung(int luongcung) {
		this.luongcung = luongcung;
	}
	public int tinhluong() {
		return this.luongcung+this.tienthuong-this.tienphat;
		
	}
	@Override
	public String toString() {
		return "nvienfulltime [tienthuong=" + tienthuong + ", tienphat=" + tienphat + ", luongcung=" + luongcung
				+ ", tinhluong()=" + tinhluong() + "]";
	}
	
	
	
}

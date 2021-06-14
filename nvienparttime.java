package btvn1;

public class nvienparttime extends Person{
	private int time;

	public nvienparttime() {
	}

	public nvienparttime(String name, int age, int sdt, String email, int id, int time) {
		super(name, age, sdt, email, id);
		this.time = time;
	}

	public nvienparttime(int time) {
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	public int tinhluong() {
		return this.time*100000;
	}

	@Override
	public String toString() {
		return "nvienparttime [time=" + time + ", getTime()=" + getTime() + ", tinhluong()=" + tinhluong() + "]";
	}
	
	
}

package sdut.ls.bean;

import java.util.Date;

public class Run {
	private int id;
	private String financename;
	private String sorts;
	private double money;
	private Date time;
	private String inoutsort;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFinancename() {
		return financename;
	}
	public void setFinancename(String financename) {
		this.financename = financename;
	}
	public String getSorts() {
		return sorts;
	}
	public void setSorts(String sorts) {
		this.sorts = sorts;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getInoutsort() {
		return inoutsort;
	}
	public void setInoutsort(String inoutsort) {
		this.inoutsort = inoutsort;
	}
	
	
}

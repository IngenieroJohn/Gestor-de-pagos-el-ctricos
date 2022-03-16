
public class Consumo {
	private int id;
	private Plan_Electrica plan;
	
	public Consumo() {
		
	}
	public Consumo(int id, Plan_Electrica plan) {
		this.id= id;
		this.plan = plan;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Plan_Electrica getPlan() {
		return plan;
	}


	public void setPlan(Plan_Electrica plan) {
		this.plan = plan;
	}
	

}

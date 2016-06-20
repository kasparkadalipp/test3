package test1;

public class PC {

	private String pc_case;
	private String gpu;
	private String cpu;
	
	public String hobune = "YO RAFFAS";
	
	public String getPc_case() {
		return pc_case;
	}
	public void setPc_case(String pc_case) {
		this.pc_case = pc_case;
	}
	
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	// SEE STRING SIIN ON MEETODI TAGASTUSVÄÄRTUS
	public String lammas(){
		return "lammas";
	}
	public String hobune(){
		return "obene lel";
	}
	public String specs() {
		return("Minu arvuti korpus on "+ pc_case +", protsessor on " + cpu +", video kaart on " + gpu);
		
	}
}

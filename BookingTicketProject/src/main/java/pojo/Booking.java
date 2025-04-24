package pojo;

public class Booking {
	private int pid;
	private String pname;
	private String psource;
	private String pdestination;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPsource() {
		return psource;
	}
	public void setPsource(String psource) {
		this.psource = psource;
	}
	public String getPdestination() {
		return pdestination;
	}
	public void setPdestination(String pdestination) {
		this.pdestination = pdestination;
	}
	@Override
	public String toString() {
		return "Booking [pid=" + pid + ", pname=" + pname + ", psource=" + psource + ", pdestination=" + pdestination
				+ "]";
	}
	
	
}

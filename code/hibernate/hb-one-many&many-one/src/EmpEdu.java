import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmpEdu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int euId;
	private String title;
	private double percent;
	private String passyear;
	@ManyToOne(fetch = FetchType.LAZY) // Many EduDetails to One Employee
	@JoinColumn(name = "eid") // to specify the name of the FK
	private EmpInfo emp;
	public int getEuId() {
		return euId;
	}
	public void setEuId(int euId) {
		this.euId = euId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public String getPassyear() {
		return passyear;
	}
	public void setPassyear(String passyear) {
		this.passyear = passyear;
	}
	public EmpInfo getEmp() {
		return emp;
	}
	public void setEmp(EmpInfo emp) {
		this.emp = emp;
	}
	
}

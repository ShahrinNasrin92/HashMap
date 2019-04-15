package Model;

public class Student
{
	private String id;
	private String name;
	private int credit;
	private String dept;
	public Student(String id, String name, int credit, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.credit = credit;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", credit=" + credit + ", dept=" + dept + "]";
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}

package Login;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class Employee {
	private String name;
	private String login;
	private String password;
	private Job job;
	
	public Employee(String name, String login, String password, Job job) {
		this.name = name;
		this.login = login;
		this.password = password;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
	
	public static String toXml(Employee data)
	{
		XStream xstream = new XStream(new StaxDriver());
		xstream.alias("Employee", Employee.class);
		return xstream.toXML(data);
	}
	
	public static Employee fromXml(String xml)
	{
		XStream xstream = new XStream(new StaxDriver());
		xstream.processAnnotations(Employee.class);
		xstream.alias("Employee", Employee.class);
		return (Employee) xstream.fromXML(xml);
	}
	
}

package lombok;
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)

public class EmployeLombok extends PersonneLombok {
	
	private float salary;
	
	public EmployeLombok (int age, String name, String surname, float salary) {
		super(age, name, surname);
		this.setSalary(salary);

}
}

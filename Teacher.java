

/**
 * @author NAC
 * @version 1.0
 * @created 06-Jan-2021 3:00:37 PM
 */
public class Teacher extends Employee {

	private String qualification;
	private String specialization;
	private String office;
	public Course m_Course;
	public Notification m_Notification;

	public Teacher(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param task    task
	 */
	public void assignTask(Task task){

	}

}
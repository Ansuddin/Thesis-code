public class Hospital{
	private String matrixUser;
	private String matrixPassword;
	private String[] roomIdsForPatientJournals;
	private String name;
	private ArrayList<Employees> employees;
	private ArrayList<PatientJournals> PatientJournals;


	public Hospital(String matrixUser, String matrixPassword, String roomIds){
		this.matrixUser = matrixUser;
		this.matrixPassword = matrixPassword;
		this.roomIdsForPatientJournals = roomIds;
	}

	public void setEmployees(ArrayList<Employee> employees){
		this.employees = employees;
	}
}
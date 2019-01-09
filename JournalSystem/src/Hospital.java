public class Hospital{
	private String matrixUser;
	private String matrixPassword;
	//private String[] roomIdsForPatientJournals;
	private String[] hospitalMatrixIds;
	private String name;
	private ArrayList<Employees> employees;
	private ArrayList<String> PatientJournalRoomIds;


	public Hospital(String matrixUser, String matrixPassword, String roomIds){
		this.matrixUser = matrixUser;
		this.matrixPassword = matrixPassword;
		this.roomIdsForPatientJournals = roomIds;
	}

	public void setEmployees(ArrayList<Employee> employees){
		this.employees = employees;
	}
}
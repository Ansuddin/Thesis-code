import org.jpy.PyLib;
import org.jpy.PyModule;
import org.jpy.PyObject;
import org.jpy.PyInputMode;

public class Main {

	public static void main(String[] args) {

		// Initialize data objects in-memory
		Hospital hospital = new Hospital();
		ArrayList<Employees> employees = new ArrayList<Employees>();
		ArrayList<PatientJournal> patientJournals = new ArrayList<PatientJournal>();
		hospital.setEmployees(employees);

		// Initialize Python
		System.out.println("initialize Python");
		if(!PyLib.isPythonRunning()){
			PyLib.startPython();
			System.out.println("Python started");
			try {

				// Start program 
				while(true){

					// Prompt user for username and password
					String username = ""; 
					String password = "";

					// Check if login is succesful
					if( int id = login(username,password) != null){

						// Get employee
						Employee employee = employees.get(id);

						//Give options to user
						System.out.println("Options");
						// 1. get all related patients
						// 2. get specific patient journal 
						// 3. add to patient journal
						// 4. log out

						// Prompt user 
						Scanner scanner = new Scanner(System.in);
						int option = scanner.nextInt();
						switch(option){
							case 1: 
								ArrayList<PatientJournals> relatedJournals =Hospital.getPatients(employee);
								printJournals(relatedJournals);
								break;
							case 2:
								ArrayList<PatientJournals> relatedJournals =Hospital.getPatients(employee);
								//Give options
								printPatientIds(relatedJournals);
								int patientid = scanner.nextInt();
								PatientJournal patientjournal = relatedJournals.get(patient);
							case 3:
								ArrayList<PatientJournals> relatedJournals =Hospital.getPatients(employee);
								//Give options
								printPatientIds(relatedJournals);
								int patientid = scanner.nextInt();
								PatientJournal patientjournal = relatedJournals.get(patient);

								//Give options
								// Select what to add 
								// Scan for the addition

							case 4:
								System.out.println("Logging out");
								break;

							case 5:
								System.out.println("Unrecognized input");
								break;
						}

					} else {
						System.out.println("Login failed");
						break;
					}

				}

			} finally {
				PyLib.stopPython();
			}
		}

	}
}
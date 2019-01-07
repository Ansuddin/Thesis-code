public interface Matrix {
	void send(String message);
	String retrive();
	void join();
	void register();
	void login();
	void invite();
	void ban();
	void unban();
	String[] getParticipants();

}
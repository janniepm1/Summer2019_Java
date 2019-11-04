package Day42encapsulationOOP;

public class testData {
	/*
	 * Name
	 * ID
	 */

		private String Name="Cinthya";//sate is not visible to any other classes
		private int ID=897;
		//getter read the data
		public String getName() {
			return Name;
		}
		public int getID() {
			return ID;
		}
		//setter: to change value 
		public void setName(String Name) {
			this.Name=Name;
		}
		public void setID(int ID) {
			this.ID=ID;
		}
}

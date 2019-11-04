package Day45_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credentials{
		private String UserName;
		private String PassWord;
		
		public credentials() {
			setUserName("admin");
			setPassword("123");
			
		}
		
		//getter
		public String getUserName() {
			return UserName;
		}
	
		public String getPassWord() {
			return PassWord;
		}
		//setter:modify the values 
		public void setUserName(String UserName) {
			this.UserName=UserName;
		}
		public void setPassword(String PassWord) {
			this.PassWord=PassWord;
		}
		public void setCredentials(String UserName, String PassWord) {
			this.UserName=UserName;
			this.PassWord=PassWord;
		}
		public void getInfo() {
			System.out.println("Username is "+UserName);
			System.out.println("Password: "+PassWord);
		}
	
		
	
			
		}
	public class encapsulationReview {
		public static void main(String[] args) {
			
			credentials obj=new credentials();
		//	obj.UserName="Cinthya";
			//obj.PassWord="123456";
			System.out.println(obj.getUserName());
			System.out.println(obj.getPassWord());
			
			credentials Nina=new credentials();
			Nina.setUserName("Nina1");
			Nina.setPassword("12345fge");
			System.out.println(Nina.getUserName());
			System.out.println(Nina.getPassWord());
			Nina.setCredentials("Nina123","12123cyber");
			
			credentials Nurzat=new credentials();
			Nurzat.setUserName("9807");
			Nurzat.setPassword("nuri345");
		//	credentials Nurzat=new credentials();
			System.out.println(Nurzat.getUserName());
			System.out.println(Nurzat.getPassWord());
			
			credentials Seyfo=new credentials();
			Seyfo.setCredentials("Seydfo123","Cybertek");
			Seyfo.setCredentials("Seyfo", "456");
			Seyfo.setPassword("7898");
			
			Seyfo.getInfo();
System.out.println("==========================================");
			
credentials[] users= {Nina,Nurzat,Seyfo};
users[0].getInfo();
users[1].getInfo();
users[2].getInfo();

ArrayList<credentials> CredentialList=new ArrayList<credentials>();
CredentialList.addAll(Arrays.asList(Nina,Nurzat,Seyfo));


for(credentials each:CredentialList) {
	each.getInfo();
	
}

			
			
			
			
		}
	}
	


package reqannotation;

import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;

public class DriverDemo {
	
	
	private String url;
	private String user;
	private String password;

	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUser() {
		return user;
	}

@Required
	public void setUser(String user) {
		this.user = user;
	}

@Required
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void printconn() throws Exception{
		
		java.sql.Connection conn =DriverManager.getConnection(url,user,password);
		System.out.println(conn);
	}

}

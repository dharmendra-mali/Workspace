package bean3;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import com.mysql.jdbc.Connection;

public class Test  {

	private String url,userName,password;
	private Connection connection;
	private PreparedStatement preparedStatement;
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@PreDestroy
	public void conDestroy() throws Exception {
		
		 
		connection.close();
		System.out.println("connation close");
	}

	@PostConstruct
	public void conInit() throws Exception {
		
		connection =(Connection) DriverManager.getConnection(url, userName, password);
		   System.out.println("connation estavlist");
		
	}
	
	public void save(int stdId,String stdname,String stdEmail) throws SQLException{
		
		preparedStatement=connection.prepareStatement("insert into student values(?,?,?)");
		preparedStatement.setInt(1, stdId);
		preparedStatement.setString(2, stdname);
		preparedStatement.setString(3, stdEmail);
		preparedStatement.executeUpdate();
		System.out.println("insertion sucssces");
		
	}
	
	
	
	

}

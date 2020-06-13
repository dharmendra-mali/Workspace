package bean;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import com.mysql.jdbc.Connection;

public class Test  implements InitializingBean,DisposableBean{

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

	@Override
	public void destroy() throws Exception {
		
		 
		connection.close();
		System.out.println("connation close");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
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

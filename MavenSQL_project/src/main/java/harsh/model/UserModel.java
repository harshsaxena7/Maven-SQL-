package harsh.model;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;

import harsh.config.DatabaseConfig;
import harsh.entity.User;

public class UserModel {
public List<User> listuser() {
	List<User> listusers = new ArrayList<User>();
	//1: connection object init
	Connection connect = DatabaseConfig.getConnection();
java.sql.Statement stmt = null;
	Result rs = null;
	//2:create db query
	String query="select from users";
	try {
		stmt=connect.createStatement();
	}
}
}

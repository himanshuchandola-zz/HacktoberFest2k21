import java.sql.*;

public class JdbcOdbcDemo {
	public static void main(String[] args) {
		int numRows = 0;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String dbPath = "D:/java programs/sem-6/JDBC/test.accdb";
			String connURL = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + dbPath;
			Connection con = DriverManager.getConnection(connURL, "", "");
			Statement st = con.createStatement();
			st.execute("SELECT * FROM test;");
			ResultSet rs = st.getResultSet();
			while(rs.next()) {
				System.out.println("\n" + rs.getString("Enrollment") + "\t" + rs.getString(3));
				numRows++;
			}
			System.out.println(numRows + "Rows(s) available");
			con.close();
		} catch(SQLException se) {
			System.out.println("SQLException Occured\n " + se.getMessage());
		} catch(ClassNotFoundException ce) {
			System.out.println("ClassNotFoundException Occured\n " + ce.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
package hu.nive.ujratervezes.zarovizsga.peoplesql;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeopleDao {

    private DataSource dataSource;

    public PeopleDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String findIpByName(String firstName, String lastName) {
        //tesztelés: SELECT ip_address FROM people WHERE first_name = 'Vilma' AND last_name = 'Bowlands';
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select ip_address from people where first_name = ? and last_name = ?");
        ) {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);

            return findIpAddress(stmt);


        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }

    }

    public String findIpAddress(PreparedStatement stmt) {
        try (
                ResultSet rs = stmt.executeQuery();
        ) {
            if (rs.next()) {
                String ipAddress = rs.getString("ip_address");
                return ipAddress;
            }
            throw new IllegalArgumentException("No result");
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }

    }
}

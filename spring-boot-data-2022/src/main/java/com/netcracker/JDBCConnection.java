package com.netcracker;

import com.netcracker.entity.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnection {

    public static void main(String[] args) {
        JDBCConnection jdbcConnection = new JDBCConnection();
        List<Employee> employee = jdbcConnection.retrieveAll();
        employee.forEach(System.out::println);
    }

    public List<Employee> retrieveAll() {

        List<Employee> result = new ArrayList<>();
        try (Connection connection = prepareConnection()) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee");

            while(resultSet.next()){
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("name"));
                employee.setPosition(resultSet.getString("position"));
                employee.setSalary(resultSet.getDouble("salary"));
//                result.add('employee');

            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private Connection prepareConnection() throws ClassNotFoundException {

        try{
            Connection connection
                    = DriverManager.getConnection(
                            "jdbc:posrgresql://localhost:5432/testdb", "postgres","postgres" );{
                Class.forName("org.postgresql.Driver");

                return connection;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}






package com.examples.exetel;

import org.testng.annotations.Test;

import java.sql.*;

/**
 * Created by Chathura on 1/5/2017.
 */
public class Exetel {


    @Test
    public static void test() {
        double newAmount = 0.0;

        try {

            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/phpmyadmin/#PMAURL-8:db_structure.php?db=chathura&table=&server=1&target=&token=5390a55453b9f6c5440cf1ef4619d0b5";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            String query = "SELECT * FROM exetel";

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                double amount = rs.getDouble("amount");
                newAmount = amount - 10;
                System.out.println(newAmount);

            }

            String query2 = "update exetel set amount = ? where aid = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query2);
            preparedStmt.setDouble(1, newAmount);
            preparedStmt.setInt(2, 1);

            preparedStmt.executeUpdate();

            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}

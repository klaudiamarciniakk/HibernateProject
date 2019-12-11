import org.hibernate.Hibernate;

import java.sql.*;

public class App {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://balarama.db.elephantsql.com:5432", "yoqomwav", "aKalGO8OkfFFwOITn8rnJTe6EwrJUc3x")) {
            System.out.println("Java JDBC PostgreSQL Example");

            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            System.out.println("Reading movie records...");
            System.out.printf("%-30.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s\n", "id_film", "nazwa", "cena", "gatunek_id", "opis", "zawiastun_id","rok_wydania");
            ResultSet resultSet = statement.executeQuery("select * from yoqomwav.movie_rental.film");
            while (resultSet.next()) {
                System.out.printf("%-30.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s %-30.30s\n", resultSet.getString("id_filmu"), resultSet.getString("nazwa"),
                        resultSet.getString("cena"), resultSet.getString("gatunek_id"), resultSet.getString("opis"), resultSet.getString("zwiastun_id"),  resultSet.getString("rok_wydania"));
            }


        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}

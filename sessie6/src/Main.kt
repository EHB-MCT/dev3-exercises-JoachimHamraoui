import java.sql.*
import java.util.*

fun main() {

    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()
    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword

    // Create the connection: this will allow us to run queries on it later
    val connection = DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName, connectionProps)

    //Query variable
    // val query = "SELECT * FROM trains WHERE type LIKE 'S23256'"

    val statement = connection.prepareStatement("SELECT * FROM trains WHERE type LIKE \"S23256\"")
// The result of your query will be a type ResultSet
// This is a bit similar to collections in Kotlin
// But since the library is based on Java, we get a type from Java
    val result = statement.executeQuery()

    while (result.next()) {
        val typeOfTrain = result.getString("type");
        println(typeOfTrain);
    }

}
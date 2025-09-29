# Java MySQL JDBC Example

This is a simple Java project that demonstrates how to connect to a MySQL database using **JDBC** and execute a query.

---

## 📂 Project Structure

```
project-root/
│── lib/                 # External libraries (MySQL connector JAR)
│   └── mysql-connector-j-<version>.jar
│── out/                 # Compiled .class files
│── src/                 # Source code
│   └── Main.java
│── README.md            # Project documentation
```

---

## ⚙️ Requirements

* **Java 8+**
* **MySQL Server** (running with a test database)
* **MySQL Connector J** (placed inside the `lib/` folder)

---

## 🔧 Setup

1. Update the database connection details inside `src/Main.java`:

   ```java
   String url = "jdbc:mysql://localhost:3306/your_database_name";
   String user = "your_username";
   String pass = "your_password";
   ```

2. Make sure the table `department` exists in your MySQL database:

   ```sql
   CREATE TABLE department (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100)
   );
   ```

---

## ▶️ How to Compile and Run

### 1. Compile

From the **project root**, run:

```sh
javac src/Main.java -d out
```

### 2. Run

```sh
java -cp ,:lib/mysql-connector-j-<version>.jar:out Main
```

*(On Windows, replace `:` with `;` in the classpath.)*

---

## 📋 Example Output

```
Connected to Database successfully.
ID: 1, Name: HR
ID: 2, Name: Finance
ID: 3, Name: IT
```

---

## 📝 Notes

* Make sure MySQL server is running and accessible.
* If you face `ClassNotFoundException: com.mysql.cj.jdbc.Driver`, ensure that the correct MySQL Connector JAR file is present in the `lib/` folder.
* You can download the latest MySQL connector from:
  [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)


# Lab Sheet 08 - Student Management System

A Java-based console application implementing a Student Management System. This project demonstrates the usage of the Data Access Object (DAO) pattern, JDBC for database connectivity, and clean architectural design separated into distinct executable layers.

## 🛠️ Tech Stack & Prerequisites

*   **Java Development Kit (JDK):** Version 8 or higher
*   **Build Tool:** Apache Maven
*   **Database:** Relational Database (e.g., MySQL / PostgreSQL) with JDBC configuration

---

## 📂 Project Structure

The project follows a standard Maven directory structure layout:

```text
Lab Sheet 08/
│
├── src/
│   └── main/
│       └── java/
│           └── Questions/
│               ├── Student.java                  # Student Entity/Model class
│               ├── StudentDAO.java               # Data Access Object handles SQL queries
│               ├── StudentDatabaseConnection.java # Handles database driver & connection
│               ├── StudentConnectionTest.java     # Utility to verify DB connectivity
│               ├── StudentInsertMain.java         # Main executable to add students
│               ├── StudentDisplayMain.java        # Main executable to view students
│               └── StudentSearchUpdateMain.java   # Main executable to search & modify data
│
└── pom.xml                                       # Maven configuration & dependencies


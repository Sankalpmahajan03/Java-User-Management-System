# 🧑‍💻 Java User Management System (JDBC + MySQL)

A console-based User Management System built using **Java, JDBC, and MySQL**, designed to perform CRUD operations securely through an object-oriented structure. The application supports user registration, password updates, and fetching user details based on different criteria.


## 🚀 Features

| Feature | Description |
|--------|-------------|
| ➕ Register User | Stores a new user in the database |
| 🔍 View User by Username | Displays details of a specific user |
| 🌍 View Users by City | Shows all users living in a given city |
| 🔑 Update Password | Allows secure password modification |
| ⚙ Reusable DB Connection | Centralized JDBC connection handling |


## 🛠 Tech Stack

- **Java**
- **JDBC**
- **MySQL**
- **OOP (Object-Oriented Programming)**

---

## 📂 Project Structure

```
src/
└── org.sankalp/
    ├── DBconnection.java            // Handles database connection
    ├── RegisterUser.java            // Inserts user into DB
    ├── DisplayUserDetails.java      // Fetch user by username
    ├── DisplayUserBasedOnCity.java  // Fetch users by city
    ├── UpdatePassword.java          // Update user password
    └── Entry.java                   // Main CLI & menu program
```


## 🗄 Database Schema (MySQL)

CREATE TABLE userdetails (
    Username VARCHAR(40) PRIMARY KEY,
    Password VARCHAR(30) NOT NULL,
    City VARCHAR(40) NOT NULL
);

## 📌 Console Menu Example

Enter 1 to Register User
Enter 2 to Display Users based on City
Enter 3 to Update User Password
Enter 4 to Display User Details based on Username

## 🧾 UML Use Case Diagram

```
         +-------------+
         |   User      |
         +-------------+
              |
      ---------------------
      |       |          |
 Register   View      Update
  User     User       Password
              |
 +--------------------------------+
 |      User Management System    |
 +--------------------------------+
```

---

### 🎉 Thank You!

If you like this project, don’t forget to ⭐ **Star this Repository!**


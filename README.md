# 🏦 Bank Management System

> A Java Swing desktop application simulating core ATM banking operations with a MySQL backend. Built using OOP principles with a GUI-first approach.

[![Java](https://img.shields.io/badge/Java-Swing-orange?logo=java)](https://www.java.com)
[![MySQL](https://img.shields.io/badge/Database-MySQL-4479A1?logo=mysql)](https://www.mysql.com)

---

## ✨ Features

- **Multi-step Signup** — 3-step registration flow (personal info → account details → PIN setup)
- **Login** — PIN-based ATM login
- **Deposit** — Add funds to account
- **Cash Withdrawal** — Withdraw with balance validation
- **Fast Cash** — Quick preset withdrawal amounts
- **Balance Enquiry** — View current balance
- **PIN Change** — Update ATM PIN securely
- **Mini Statement** — View recent transaction history
- **GUI Interface** — Java Swing with custom background images and styled buttons

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| UI | Java Swing (JFrame, JButton, JLabel) |
| Database | MySQL |
| JDBC Driver | mysql-connector-java 8.0.28 |
| UI Calendar | jcalendar-tz 1.3.3.4 |
| IDE | IntelliJ IDEA |

## 🗄️ Database

Requires a MySQL database. The `Connn.java` class handles JDBC connection. Update the connection string with your local MySQL credentials before running.

## 🚀 Run Locally

```bash
git clone https://github.com/binoremohapatra/bankmangementsystem.git
```

1. Open in IntelliJ IDEA
2. Add MySQL Connector JAR and jcalendar JAR to project libraries
3. Create a MySQL database and update `Connn.java` with your credentials
4. Run `main_Class.java`

## 📁 Project Structure

```
src/bank/management/system/
├── main_Class.java     Main ATM menu (transaction selection)
├── Login.java          PIN-based login screen
├── Signup.java         Step 1 — personal info
├── Signup2.java        Step 2 — account details
├── Signup3.java        Step 3 — PIN setup
├── Deposit.java        Deposit flow
├── Withdrawl.java      Withdrawal flow
├── FastCash.java       Quick withdrawal amounts
├── BalanceEnquriy.java Balance display
├── Pin.java            PIN change
├── mini.java           Mini statement
└── Connn.java          MySQL JDBC connection provider
```

---

**Built by [Binore Mohapatra](https://github.com/binoremohapatra)**

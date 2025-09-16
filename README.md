# Java OOP - LAB211 FPT

This repo includes 4 labs with 175 locs and 1 lab with 150 locs, see the code of each lab in each branch named by the last two numbers of the lab code.

### J1.L.P0021

- **Student Management (OOP + ArrayList):**  
  A Java console program to manage student information (ID, Name, Semester, Course – limited to Java, .Net, C/C++). The program allows creating students, finding/sorting, updating/deleting, and generating reports of total courses per student.

- **Main Features:**  
  1️⃣ **Create:** create at least 10 students, prompt to continue if more are added.  
  2️⃣ **Find/Sort:** search students by name (or partial name), display results and sort by name.  
  3️⃣ **Update/Delete:** find by ID, then choose to update or delete.  
  4️⃣ **Report:** display each student with their course and the total number of courses they have taken.

- **Technical Requirements:**  
  Use Object-Oriented Programming, `ArrayList`, `Collections.sort()` with `Comparator`, and only core Java libraries.

### J1.S.P0072

- **Login Function with MD5 Encryption:**  
  Build a Java console program that manages user accounts and provides a login function. Each account includes: Username, Password, Name, Phone, Email, Address, and Date of Birth (DOB). The program validates phone (10–11 digits), email format, and DOB format (`dd/MM/yyyy`). Passwords must be encrypted with MD5 before storage.

- **Main Features:**  
  1️⃣ **Add Account:** prompt user for account details, validate input (username unique and not empty, valid phone/email/DOB), encrypt password using MD5, and store the account.  
  2️⃣ **Login:** ask for username and password, check against stored accounts, and display greeting on success or failure message otherwise.  
  3️⃣ **Exit:** close the program.

- **Technical Requirements:**  
  Implement `addAccount()` (returns account ID or exceptions) and `login()` (returns login status). Use only core Java libraries, proper input validation, and MD5 encryption for passwords.

### J1.L.P0022

- **Candidate Management System (OOP + Inheritance):**  
  Build a Java console program to manage company candidates. Each candidate has common attributes (ID, Name, Birth Date, Address, Phone, Email, Type) and belongs to one of three types: **Experience**, **Fresher**, or **Intern** – each type has additional specific attributes (e.g., Experience → Years of Experience, Professional Skill). All candidates are stored in an `ArrayList`.

- **Main Features:**  
  1️⃣ **Create Candidate:** create Experience, Fresher, or Intern candidates with input validation (DOB = 4-digit year, Phone ≥ 10 digits, Email format, ExpYears 0–100, Graduation Rank ∈ {Excellence, Good, Fair, Poor}); allow multiple entries until user stops, then display all candidates.  
  2️⃣ **Search Candidate:** search by name (first or last) and candidate type, then display matched candidates with all details.  
  3️⃣ **Exit:** quit the program.

- **Technical Requirements:**  
  Use **Object-Oriented Programming** with inheritance (`Candidate` superclass + `Experience`, `Fresher`, `Intern` subclasses), `ArrayList` to store candidates, and only core Java functions.

### J1.L.P0023

# Fruit Shop Management System  

## Overview  
This is a **Java console-based application** to manage a fruit shop.  
It allows shop owners to create fruits, view all customer orders, and enables customers to shop easily.  
Fruits are stored in an **ArrayList**, and orders are stored in a **HashTable** (key = customer name, value = list of purchased items).  

## Main Features  
1️⃣ **Create Fruit**  
- Shop owners can add new fruits with attributes: **Fruit ID, Name, Price, Quantity, Origin**.  
- Validate data (price > 0, quantity > 0).  
- Allow multiple entries until the user stops, then display all created fruits.  

2️⃣ **Shopping**  
- Display all fruits for customers.  
- Customers select fruits by item number, input quantity, confirm order, and input their name to save purchase.  

3️⃣ **View Orders**  
- Show all customers' orders with details: Product, Quantity, Price, Amount, and Total.  

4️⃣ **Exit**  
- Quit the program.  

## Technical Requirements  
- Use **Object-Oriented Programming (OOP)**.  
- Use **ArrayList** to store fruits and purchased items.  
- Use **HashTable** to store orders by customer name.  
- Only use core Java functions and classes.  

### J1.S.P0025

## Overview  
This is a **Java console application** that reads a text file, normalizes its content, and writes the result to a new output file.  
The program ensures proper formatting of spaces, punctuation, capitalization, and sentence structure.  

## Main Features  
1️⃣ **Read Input File**  
- Read text from `input.txt` using `BufferedReader` and store content in memory.  
- Handle exceptions (file not found, cannot read, etc.).  

2️⃣ **Normalize Text**  
- Ensure only one space between words.  
- Ensure only one space after `,`, `.`, `:` and no spaces before them.  
- Capitalize the first letter after a period, first word of the file, and make other letters lowercase.  
- Remove spaces before/after quoted phrases (`“ ”`).  
- Remove blank lines between sentences.  
- Add a `.` at the end of text if missing.  

3️⃣ **Write Output File**  
- Save the normalized text to `output.txt`.  
- Handle exceptions for writing errors.  

## Technical Requirements  
- Use **Object-Oriented Programming (OOP)**.  
- Use **BufferedReader**, **StringBuffer**, and core Java classes.  
- Implement exception handling for file operations (read/write). 

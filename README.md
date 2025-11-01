# 📚 Advanced Library Management System

A **Java Console-Based Library Management System** built with a **layered architecture** that follows **OOP principles**, **Abstraction**, and **Interfaces** to ensure clean design and modularity.  
It efficiently manages core library operations such as 📖 adding, 👀 viewing, 📥 borrowing, 🔄 returning, 💾 saving, and 📂 loading books from a file — ensuring **data persistence and reliability**.

---

## 📦 Features
- ➕ Add new books with unique IDs  
- 👀 View available and borrowed books  
- 📥 Borrow and 🔄 return books with due dates  
- 💾 Save and 📂 load data from text files  
- ✅ Prevent duplicate or invalid entries  
- ⚙️ Layered design for maintainability and scalability  

---

## 🧩 Architecture Overview
The project follows a **layered and modular structure**, applying the **Repository Pattern** and **SOLID principles** for clean separation of concerns.

### 🧱 Core Components
- **📝 Book.java** — Defines the book entity and its attributes  
- **🔗 BookRepository & PersistentBookRepository** — Define contracts for managing and persisting books  
- **💾 FileBookRepository** — Handles file-based storage using `BufferedReader` and `BufferedWriter`  
- **🧠 LibraryService** — Implements business logic (add, borrow, return, save, load)  
- **🎮 Main.java** — Console-based user interface interacting with the service layer  

---

## 🛠️ Tech Stack
- **Language:** Java 17+  
- **Framework:** Core Java (Console-based)  
- **Architecture:** Layered (Service + Repository)  
- **Design Pattern:** Repository Pattern  
- **Persistence:** File I/O  

---

## 🚀 How to Run
1. Open the project in **IntelliJ IDEA** or any Java IDE  
2. Compile and run `Main.java`  
3. Follow console instructions to add, borrow, return, and view books  

---

## 🎯 Learning Focus
This project demonstrates key **Java fundamentals** such as:
- Object-Oriented Programming (Encapsulation, Abstraction, Polymorphism)  
- Interface-based design  
- File handling (I/O streams)  
- Collections framework  
- Repository design pattern  
- Clean architecture and separation of concerns

## 🧑‍💻 Author
**Sasanthi Sandaruwani**  
Undergraduate Engineering Student at Faculty of Engineering, University of Ruhuna — Passionate about Java & Software Development 💡






---

💻 The Advanced Library Management System is a well-structured Java console-based application that follows a layered architecture built on Interfaces, Abstraction, and OOP principles. It efficiently manages library operations such as 📖 adding, 👀 viewing, 📥 borrowing, 🔄 returning, 💾 saving, and 📂 loading book details from a text file — ensuring both functionality and data persistence.

🎯 Designed for intermediate Java learners, this project emphasizes clean architecture, SOLID principles, and modular design by implementing 🔗 interfaces (BookRepository, PersistentBookRepository), ⚙️ a service layer (LibraryService), and the 🧩 repository pattern (FileBookRepository, InMemoryBookRepository).

⚡ The system allows users to ➕ add books with unique IDs, 📚 view available and borrowed books, 👤 manage borrowing and returning with due dates, and ✅ maintain data integrity by preventing duplicates or invalid records.

🏗️ The architecture includes clearly defined components such as:

📝 Book.java → Defines the book entity and its properties

🧱 BookRepository & PersistentBookRepository → Define contracts for managing and persisting books

💾 FileBookRepository → Implements file-based storage using BufferedReader and BufferedWriter

🧠 LibraryService → Handles business logic (add, borrow, return, save, load)

🎮 Main.java → Console-based UI that interacts with users

🧠 This project demonstrates key Java concepts like Object-Oriented Programming (OOP), Interfaces & Abstraction, File Handling, Collections Framework, and the Repository Design Pattern, resulting in a modular, maintainable, and scalable system.

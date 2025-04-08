# 🌐 Department Website

## 📑 Project Description

The Department Website is a responsive web application designed to manage and display information related to faculty, students, and other departmental data. The frontend is built using HTML, CSS, and a little JavaScript to ensure a dynamic and interactive user experience. The backend is powered by Spring Boot to handle data processing and server-side operations.

## 🌟 Features

- 🎨 Responsive and modern UI using HTML and CSS
- ⚡ Interactive features using JavaScript
- 👥 Faculty management (add, update, delete, view)
- 📝 Student information management
- 🔒 User authentication and authorization
- 🌐 RESTful APIs for data access (Spring Boot)
- 💾 Database integration using JPA and Hibernate
- 🧩 Modular and scalable architecture

## 💻 Technologies Used

- 🌍 HTML
- 🎨 CSS
- 💡 JavaScript
- 🚀 Spring Boot
- 🗄️ JPA/Hibernate
- 📦 Maven
- 📝 Lombok
- 🗃️ Database (MySQL)

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/username/department-website.git
   ```
2. Navigate to the project directory:
   ```bash
   cd department-website
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## 🗂️ Folder Structure

```
Department-Website/
├── src/
│   └── main/
│       └── java/
│           └── com.example.DepartmentWeb.Department.Website/
│               ├── Controller/
│               ├── Models/
│               ├── Repo/
│               └── Services/
├── resources/
├── test/
├── target/
├── .gitignore
├── HELP.md
└── mvnw
```

## 🚀 Usage

1. Access the application through the web browser:
   ```
   http://localhost:8080
   ```
2. Use the provided API endpoints for CRUD operations.

## 🔗 API Endpoints

- `/api/faculty` - Get list of faculty members
- `/api/faculty/{id}` - Get a specific faculty member
- `/api/faculty` (POST) - Add a new faculty member
- `/api/faculty/{id}` (PUT) - Update a faculty member
- `/api/faculty/{id}` (DELETE) - Delete a faculty member

## 🤝 Contributing

1. Fork the repository.
2. Create a new branch for your feature:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add new feature"
   ```
4. Push the branch:
   ```bash
   git push origin feature-name
   ```
5. Open a Pull Request.

## 📸Images
Home page of the website 
![1](https://github.com/user-attachments/assets/36ea3a92-7399-4ac7-a6b7-e1fcaecccc04)

Department Details with faculty information
![2](https://github.com/user-attachments/assets/e5b55041-5e13-4bd5-9171-efddd4b08850)
![3](https://github.com/user-attachments/assets/025babef-1e71-453b-b223-714c6c216ca4)

Admission Enquiry page
![4](https://github.com/user-attachments/assets/74807828-1bcd-4193-a19a-a180c14ab01b)
![6](https://github.com/user-attachments/assets/c7c99b1c-9243-4597-9716-6fc6319a4135)

Faculty Login 
![5](https://github.com/user-attachments/assets/a4917800-8de9-4a6a-b6e1-49e76fd96723)
![9](https://github.com/user-attachments/assets/b8c8dd89-69ba-4e58-a629-296d85b9f2aa)

Database insights Admission enquiry db
![7](https://github.com/user-attachments/assets/b168d9ec-4c24-4a9c-814f-3f230d0ed1f7)

Faculty db
![8](https://github.com/user-attachments/assets/c737911b-840e-4a13-a778-5fa50c56d314)

Springboot backend 
![10](https://github.com/user-attachments/assets/986dee16-865b-4b59-b856-34b65fa86984)

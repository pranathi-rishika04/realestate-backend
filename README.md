# 🏠 Real Estate Platform Backend

A Spring Boot backend API for the Real Estate Platform that manages property listings, image uploads, and database operations.

---

## 📌 Project Overview

The backend handles all server-side operations for the Real Estate Platform.

It provides REST APIs for:

- Fetching property listings
- Adding new properties
- Updating properties
- Deleting properties
- Uploading images using Cloudinary

The backend uses MySQL database hosted on Railway and is deployed on Render.

---

## ✨ Features

### 🏘️ Property APIs
- Fetch all properties
- Add new properties
- Update property details
- Delete properties

### 🖼️ Image Upload
- Upload property images
- Cloudinary integration

### 🗄️ Database
- MySQL database integration
- Spring Data JPA

### 🔒 Backend Services
- REST API architecture
- Docker deployment
- Environment configuration

---

## 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate

### Database
- MySQL
- Railway

### Cloud Services
- Cloudinary
- Render
- Docker

---

## 📂 Project Structure

```bash
realestate-backend
│
├── .mvn
│   └── wrapper
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│
├── mvnw
├── mvnw.cmd
├── pom.xml
├── Dockerfile
├── .gitignore
└── README.md
```

---

## ⚙️ Installation & Setup

### 1️⃣ Clone Repository

```bash
git clone https://github.com/pranathi-rishika04/realestate-backend.git
```

### 2️⃣ Navigate to Project Folder

```bash
cd realestate-backend
```

### 3️⃣ Configure Database

Update `application.properties` with your MySQL database credentials:

```properties
spring.datasource.url=YOUR_DATABASE_URL
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

### 4️⃣ Build Project

```bash
./mvnw clean install
```

### 5️⃣ Run Backend Server

```bash
./mvnw spring-boot:run
```

---

## 🌐 Deployment

Backend deployed using Render:

https://realestate-backend-6p82.onrender.com

---

## 🔗 API Endpoint

Main API Endpoint:

https://realestate-backend-6p82.onrender.com/api/properties

---

## 🗄️ Database Hosting

Database hosted using Railway MySQL.

---

## ☁️ Image Hosting

Images hosted using Cloudinary.

---

## 👩‍💻 Author

Pranathi Rishika

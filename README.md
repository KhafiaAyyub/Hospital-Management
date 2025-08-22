# Spring Data JPA 


## Overview
Spring Data JPA is a powerful abstraction over JPA (Java Persistence API) and Hibernate, making database access easier by removing boilerplate code.  
It provides repository interfaces for CRUD, pagination, sorting, and custom queries.

---

## 1. Introduction
- **JPA** – A specification for Object-Relational Mapping (ORM) in Java.
- **Hibernate** – Default JPA provider used by Spring Boot.
- **JDBC** – Low-level API used by Hibernate to interact with the database.

---

## 2. Architecture Layers
```text
Spring Data JPA
    ↓
JPA (Specification)
    ↓
Hibernate (Implementation)
    ↓
JDBC (Database Communication)
    ↓
Database


Final Project JayJay Test Automation (API & Web)

This repository contains an Automation Testing Framework
built with Java for testing REST API and Web UI. 
The framework implements a Behavior-Driven Development (BDD) 
approach using Cucumber, Selenium, and RestAssured, managed via Gradle.

API test scenarios utilize endpoints from [gorest.co.in](https://gorest.co.in/), 
while Web UI test scenarios are executed on [saucedemo.com](https://www.saucedemo.com/).

---

📌 Scope & Test Features

Test scenarios are written in Gherkin format and divided into two main categories:

API Testing (`api.feature`)
Get User Profile: Validates fetching user details by User ID.
Create User: Tests registering a new user.
Update User: Validates updating user profile information.
Delete User: Tests deleting a user account from the system.

Web UI Testing (`web.feature`)
Authentication - Positive: Validates successful login using valid credentials.
Authentication - Negative: Validates error message display when logging in with invalid credentials.

---

System Requirements

Ensure your local environment meets the following prerequisites before running the tests:

Java Development Kit (JDK): Version 17 (Recommended).
Gradle: Version 7.x or higher.
Browser & Driver: Google Chrome
IDE: IntelliJ IDEA.
<img width="1365" height="632" alt="image" src="https://github.com/user-attachments/assets/81727f4b-ac9d-499f-a0ec-0735b0512440" />

# SMARTPANTRYMANAGER

## ANDROID MOBILE APPLICATION DEVELOPMENT PROJECT REPORT

**Student Name:** Sinetemba Xhosa

**Student Number:** 402412872

**Module:** Mobile Application Development 700

**Institution:** Richfield Graduate Institute of Technology

**Programme:** Bachelor of Science in Information Technology

**Submission Date:** 30/09/2026

**GitHub Repository:**
https://github.com/Snez06/SmartPantryManager

---

# TABLE OF CONTENTS

1. Introduction
2. Project Overview
3. Problem Statement
4. Project Objectives
5. Functional Requirements
6. Non-Functional Requirements
7. Technologies and Development Environment
8. System Design
9. Application Development and Implementation
10. Application Features
11. Database and Data Management
12. User Interface Design
13. Testing
14. GitHub and Version Control
15. Challenges and Solutions
16. Screenshots and Evidence
17. Conclusion
18. Recommendations and Future Improvements
19. References
20. Appendix

---

# 1. INTRODUCTION

SmartPantryManager is an Android mobile application developed to assist users in managing pantry ingredients. The application allows users to record information about ingredients, including the ingredient name, quantity, and expiry date.

The project demonstrates the practical application of Android mobile application development concepts, including user interface design, input handling, data management, validation, testing, and version control.

The application was developed using Android Studio and managed through Git and GitHub.

---

# 2. PROJECT OVERVIEW

## 2.1 Project Name

**SmartPantryManager**

## 2.2 Project Type

Android Mobile Application

## 2.3 Repository

**GitHub:**
https://github.com/Snez06/SmartPantryManager

## 2.4 Purpose of the Application

The purpose of SmartPantryManager is to provide users with a simple mobile solution for recording and managing pantry ingredients.

Users can enter information about pantry items and keep track of their quantities and expiry dates.

## 2.5 Target Users

The application is intended for individuals and households who want to keep track of pantry ingredients using an Android mobile device.

---

# 3. PROBLEM STATEMENT

Managing pantry ingredients manually can make it difficult to keep track of available items, quantities, and expiry dates.

Users may forget which ingredients they have available or overlook products approaching their expiry dates.

SmartPantryManager addresses this problem by providing a centralised mobile application where pantry information can be recorded and managed.

---

# 4. PROJECT OBJECTIVES

The main objective of the project is to develop an Android application that allows users to manage pantry ingredients.

The specific objectives are:

1. To develop an Android-based pantry management application.
2. To provide a user-friendly interface for entering pantry information.
3. To allow users to record ingredient names.
4. To allow users to record quantities.
5. To allow users to record expiry dates.
6. To implement input validation.
7. To test the application under different scenarios.
8. To demonstrate the use of Git and GitHub for version control.

---

# 5. FUNCTIONAL REQUIREMENTS

The application must provide the following functionality.

| Requirement     | Description                                | Status |
| --------------- | ------------------------------------------ | ------ |
| Add Ingredient  | User can add a pantry ingredient           | 👍     |
| Ingredient Name | User can enter the ingredient name         | 👍     |
| Quantity        | User can enter the quantity                | 👍     |
| Expiry Date     | User can enter an expiry date              | 👍     |
| Validation      | Application validates required information | 👍     |
| Display Records | Saved ingredients can be viewed            | 👍     |
| Data Management | Pantry information can be managed          | 👍     |

**Evidence/Screenshot:**
Please check an attached file.

---

# 6. NON-FUNCTIONAL REQUIREMENTS

## 6.1 Usability

The application should have a simple interface that allows users to enter pantry information without unnecessary complexity.

## 6.2 Performance

The application should respond to user actions without noticeable delays during normal operation.

## 6.3 Reliability

The application should handle valid and invalid user input appropriately.

## 6.4 Maintainability

The source code should be organised in a manner that allows future modifications and improvements.

## 6.5 Compatibility

The application should run on compatible Android devices and Android emulators supported by the development environment.

---

# 7. TECHNOLOGIES AND DEVELOPMENT ENVIRONMENT

The project was developed using the following technologies:

| Technology     | Purpose                                 |
| -------------- | --------------------------------------- |
| Android Studio | Android application development         |
| Java           | Application programming                 |
| XML            | User interface layouts                  |
| Android SDK    | Android development framework           |
| Gradle         | Project build and dependency management |
| Git            | Version control                         |
| GitHub         | Source-code repository                  |

## 7.1 Development Hardware

**Computer/Laptop:** Connex Swift Book Pro

**Operating System:** Windows 11

**RAM:** 4Gig😒

**Processor:** Celeron😒

## 7.2 Software Versions

**Android Studio Version:** Qual 4

**Java/JDK Version:** 

**Android SDK Version:** 

**Gradle Version:** 

---

# 8. SYSTEM DESIGN

## 8.1 Application Architecture



## 8.2 Application Flow

The general application flow is:

```text
Launch Application
        ↓
Main Screen
        ↓
Enter Ingredient Information
        ↓
Validate Input
        ↓
Save Ingredient
        ↓
Display Pantry Information
```

## 8.3 Use Case Description

### Primary Use Case: Add Pantry Ingredient

**Actor:** User

**Precondition:**
The application has been launched successfully.

**Main Flow:**

1. User opens the application.
2. User enters an ingredient name.
3. User enters the quantity.
4. User enters the expiry date.
5. User submits the information.
6. Application validates the information.
7. Application stores/displays the pantry item.

**Postcondition:**
The pantry ingredient has been successfully recorded.

---

# 9. APPLICATION DEVELOPMENT AND IMPLEMENTATION

## 9.1 Android Studio Project

Describe how the Android Studio project was created and configured.

Include:

* Project configuration
* Package name
* Minimum SDK
* Target SDK
* Build configuration
* Dependencies

**Details:**

---

---

---

## 9.2 Main Activity



## 9.3 User Interface

Describe the user interface components used.

| Component        | Purpose                 |
| ---------------- | ----------------------- |
| Text/Input Field | Ingredient name         |
| Text/Input Field | Quantity                |
| Date Input       | Expiry date             |
| Button           | Save/submit information |
| List/View        | Display pantry items    |

---

# 10. APPLICATION FEATURES

## 10.1 Adding an Ingredient

Explain how a user adds an ingredient.

**Description:**


## 10.2 Entering Quantity

Explain how the quantity is entered and processed.

**Description:**

## 10.3 Expiry Date

Explain how the expiry date is entered.

**Description:**

## 10.4 Displaying Pantry Items

Explain how saved pantry items are displayed.


# 11. DATABASE AND DATA MANAGEMENT


**Data Fields:**


## 11.1 Data Flow

```text
User Input
    ↓
Validation
    ↓
Data Processing
    ↓
Data Storage
    ↓
Display
```

Explain the implementation:

---

---

---

---

# 12. USER INTERFACE DESIGN

## 12.1 Design Principles

The application interface was designed with the following principles:

* Simplicity
* Clear labels
* Easy navigation
* Readable text
* Consistent layout
* Appropriate input controls
* User feedback

## 12.2 Main Screen
See from a different file attached

# 13. TESTING

Testing was conducted to determine whether the application functions according to the specified requirements.

## 13.1 Test Plan

| Test ID | Test Description         | Expected Result      | Actual Result | Status    |
| ------- | ------------------------ | -------------------- | ------------- | --------- |
| T001    | Launch application       | Application opens    | pass          | Pass       |
| T002    | Enter ingredient name    | Name accepted        | pass          | Pass      |
| T003    | Enter quantity           | Quantity accepted    | pass          | Pass     |
| T004    | Enter expiry date        | Date accepted        | pass          | Pass     |
| T005    | Save valid ingredient    | Ingredient saved     | pass          | Pass     |
| T006    | Submit empty fields      | Validation displayed | passed        | Pass     |
| T007    | Add multiple ingredients | Records displayed    | passed        | Pass    |

## 13.2 Functional Testing

Describe the functional testing performed.

---

---

---

## 13.3 Validation Testing

Explain how invalid or incomplete input was tested.

---

---

## 13.4 Device/Emulator Testing

**Device/Emulator:** Honor X5c

**Android Version:** Android 15

**Result:** Passed

---

# 14. GITHUB AND VERSION CONTROL

The project source code is maintained using GitHub.

**Repository:**

https://github.com/Snez06/SmartPantryManager

## 14.1 Git Commands Used

### Check Status

```bash
git status
```

### Stage Files

```bash
git add .
```

### Commit

```bash
git commit -m "Update SmartPantryManager"
```

### Push

```bash
git push
```

### Pull

```bash
git pull
```

## 14.2 Repository Evidence

Insert screenshots showing:

1. GitHub repository.
2. Project files.
3. Commit history.
4. Latest commit.
5. Branch information, if applicable.



# 15. CHALLENGES AND SOLUTIONS

During development, several challenges may have been encountered.

| Challenge                                     | Solution                                               |
| --------------------------------------------- | ------------------------------------------------------ |
| Android Studio could not find a target device | Configured an emulator/connected Android device        |
| Gradle synchronisation issues                 | Synchronised Gradle and checked dependencies           |
| Input validation problems                     | Added validation to required fields                    |
| Application build errors                      | Reviewed Build Output and corrected configuration/code |
| GitHub integration issues                     | Configured Git and pushed the project to GitHub        |

Add any additional project-specific challenges:
N/A



# 17. CONCLUSION

SmartPantryManager was developed as an Android mobile application for managing pantry ingredients.

The project demonstrates the practical implementation of Android application development concepts, including interface design, user input, validation, data management, testing, and version control.

The completed application provides users with a straightforward way to record pantry ingredients, quantities, and expiry dates.

The development process also provided practical experience in using Android Studio, Java, XML, Gradle, Git, and GitHub.

---

# 18. RECOMMENDATIONS AND FUTURE IMPROVEMENTS

The following features could be considered for future versions:

1. User authentication.
2. Ingredient search functionality.
3. Edit and delete functionality.
4. Automatic expiry notifications.
5. Colour-coded expiry status.
6. Ingredient categories.
7. Barcode scanning.
8. Cloud database synchronisation.
9. Backup and restore functionality.
10. Improved accessibility.
11. Dark mode.
12. Shopping-list functionality.

These features could extend the application beyond the basic pantry management functionality.

---

# 19. REFERENCES

Android Developers. (2026). *Android Developers Documentation*. Available at: https://developer.android.com/ (Accessed: 14 September 2026).

GitHub. (2026). *GitHub Documentation*. Available at: https://docs.github.com/ (Accessed: 14 September 2026).

Oracle. (2026). *Java Documentation*. Available at: https://docs.oracle.com/en/java/ (Accessed: 14 September 2026).


# 20. APPENDIX

## Appendix A – Source Code

Provide a reference to the GitHub repository:

https://github.com/Snez06/SmartPantryManager

* Repository
* Commits
* Branches
* Source code
* README
* Project history

---

# DECLARATION

I declare that the work presented in this report represents my work for the Mobile Application Development project, except where sources and external contributions have been appropriately acknowledged.

**Student Name:** Sinetemba Xhosa

**Student Number:** 402412872

**Signature:** S.Xhosa

**Date:** 30/09/2026





# SmartPantryManager

## Android Mobile Application

SmartPantryManager is an Android mobile application developed to help users manage pantry ingredients by recording important information such as the ingredient name, quantity, and expiry date.

The application provides a simple interface for adding and managing pantry items from an Android device.

## Repository

**GitHub:** https://github.com/Snez06/SmartPantryManager

## Features

* Add pantry ingredients
* Enter an ingredient name
* Enter the quantity of an ingredient
* Record an expiry date
* View recorded pantry items
* Validate required input
* Manage pantry information through an Android mobile interface

## Technologies Used

* **Android Studio**
* **Java**
* **Android SDK**
* **XML**
* **Gradle**
* **Git**
* **GitHub**

## Requirements

To build and run this project, you will need:

* Android Studio
* Android SDK
* Java Development Kit (JDK)
* An Android Emulator or physical Android device
* Internet connection for the initial Gradle dependency download

## Getting Started

### 1. Clone the Repository

Open Command Prompt, PowerShell, or a terminal and run:

```bash
git clone https://github.com/Snez06/SmartPantryManager.git
```

Move into the project directory:

```bash
cd SmartPantryManager
```

### 2. Open the Project in Android Studio

1. Open **Android Studio**.
2. Select **Open**.
3. Navigate to the `SmartPantryManager` folder.
4. Select the project.
5. Allow Android Studio to complete the Gradle synchronisation.
6. Wait until indexing and synchronisation are complete.

### 3. Build the Project

From Android Studio:

**Build → Make Project**

Wait for the build process to complete successfully.

## Running the Application

### Android Emulator

1. Open **Device Manager** in Android Studio.
2. Create an Android Virtual Device if one does not already exist.
3. Start the emulator.
4. Select the running emulator from the device selector.
5. Click the **Run ▶** button.

### Physical Android Device

1. Enable **Developer Options** on the Android device.
2. Enable **USB Debugging**.
3. Connect the device to the computer.
4. Accept the USB debugging permission when prompted.
5. Select the connected device in Android Studio.
6. Click **Run ▶**.

## Using the Application

After launching SmartPantryManager:

1. Enter the **Ingredient Name**.
2. Enter the **Quantity**.
3. Enter the **Expiry Date**.
4. Submit/save the pantry item.
5. Confirm that the ingredient has been added successfully.
6. Add additional ingredients when required.

### Example

| Field           | Example    |
| --------------- | ---------- |
| Ingredient Name | Rice       |
| Quantity        | 2 kg       |
| Expiry Date     | 31/12/2026 |

## Input Requirements

The following information is required when adding an ingredient:

* Ingredient name
* Quantity
* Expiry date

The application should prevent incomplete pantry records from being submitted.

## Testing

The application can be tested using the following scenarios.

### Test Case 1 — Add Ingredient

1. Launch the application.
2. Enter a valid ingredient name.
3. Enter a quantity.
4. Enter an expiry date.
5. Save the record.
6. Verify that the ingredient appears correctly.

### Test Case 2 — Empty Required Fields

1. Leave one or more required fields empty.
2. Attempt to save the record.
3. Verify that the application handles the missing information appropriately.

### Test Case 3 — Multiple Ingredients

1. Add several pantry ingredients.
2. Enter different quantities and expiry dates.
3. Verify that the records are displayed correctly.

## Git and GitHub

The project uses Git for version control and GitHub for source-code management.

Repository:

https://github.com/Snez06/SmartPantryManager

### Check Project Status

```bash
git status
```

### Stage Changes

```bash
git add .
```

### Commit Changes

```bash
git commit -m "Update SmartPantryManager"
```

### Push Changes

```bash
git push
```

### Pull Latest Changes

```bash
git pull
```

## Troubleshooting

### "No Target Device Found"

If Android Studio displays:

```text
No target device found
```

make sure that either:

* An Android Emulator is running, or
* A physical Android device is connected with USB Debugging enabled.

### Gradle Synchronisation Problems

If Gradle synchronisation fails:

1. Check the internet connection.
2. Allow Android Studio to download required dependencies.
3. Select **File → Sync Project with Gradle Files**.
4. Review the Build Output for errors.

### Build Errors

If the application does not build successfully, try:

```text
Build → Clean Project
```

followed by:

```text
Build → Rebuild Project
```

Then run the application again.

## Project Purpose

The purpose of SmartPantryManager is to demonstrate the development of an Android mobile application for managing pantry information.

The project demonstrates practical Android development concepts including:

* Android Studio project development
* User interface design
* User input handling
* Data management
* Input validation
* Application testing
* Git version control
* GitHub repository management

## Author

**Sinetemba Xhosa**

BSc Information Technology
Richfield Graduate Institute of Technology

## GitHub Repository

[SmartPantryManager](https://github.com/Snez06/SmartPantryManager)

## Academic Use

This application was developed as part of an Android Mobile Application Development academic project.


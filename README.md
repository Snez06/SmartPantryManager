# Smart Pantry Manager

Java Android application for Mobile App Development 700. The app stores pantry ingredients locally with SQLite and suggests recipes only when **every required ingredient is present in sufficient quantity**.

## Assignment alignment
- Java only; Android Studio project.
- Five Activities: Pantry List, Add/Edit Ingredient, Suggested Recipes, Recipe Detail, Settings.
- RecyclerView + custom PantryAdapter and RecipeAdapter.
- SQLiteOpenHelper with three tables and 18 seeded recipes.
- Full pantry CRUD and persistence between launches.
- Strict recipe matching with quantity checks, kg/g and L/ml conversion, and simple singular/plural normalization.
- SharedPreferences for the optional Almost-There setting.
- Bottom navigation between Pantry, Recipes and Settings.
- No Maps, GPS, location SDK, payments or Play Store publishing code.

## Open and run in Android Studio
1. Extract/open the `SmartPantryManager` folder.
2. Android Studio -> File -> Open -> select the project folder.
3. Allow Gradle sync and install any SDK components Android Studio requests.
4. Ensure a JDK 17-compatible Gradle JDK is selected under Settings/Preferences -> Build, Execution, Deployment -> Build Tools -> Gradle.
5. Create an Android Virtual Device in Device Manager (for example a Pixel device with an installed API 35 image), or connect an Android phone with USB debugging enabled.
6. Select the `app` run configuration and the emulator/phone.
7. Click Run.

If Android Studio asks to upgrade the Android Gradle Plugin, do not upgrade it immediately for the assessment. First get the supplied project running. If your installed Android Studio requires a newer compatible AGP, use its suggested upgrade and test again.

## First-run test sequence
1. Add: `tomato`, quantity `3`, unit `pcs`.
2. Add the other ingredients required by a recipe, for example `pasta 200 g`, `onion 1 pcs`, `olive oil 2 tbsp`.
3. Open Recipes. Tomato Pasta should appear only after all four required ingredients meet the quantities.
4. Delete one required ingredient and return to Recipes. The recipe must disappear from strict suggestions.
5. Edit an ingredient and verify the updated value is shown.
6. Close and reopen the app. Pantry data must still exist.
7. Trigger validation by attempting to save an empty name or zero/negative quantity.
8. Open Settings and toggle Almost-There on/off. Almost-There must remain separate from strict suggestions.

## GitHub workflow required by the brief
Create the public GitHub repository before development history is finished. Use meaningful incremental commits rather than one final commit. Suggested sequence:
1. `Initial Android Studio project scaffold`
2. `Add pantry and recipe model classes`
3. `Create SQLite schema and seed recipes`
4. `Implement pantry CRUD data source`
5. `Build pantry list and custom adapter`
6. `Add ingredient form and validation`
7. `Implement strict recipe matching`
8. `Add suggested recipes and detail screens`
9. `Add SharedPreferences settings`
10. `Add bottom navigation`
11. `Improve empty states and validation`
12. `Add README and final cleanup`

Commands after creating the GitHub repository:
```bash
git init
git add .
git commit -m "Initial Android Studio project scaffold"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/SmartPantryManager.git
git push -u origin main
```
For subsequent changes:
```bash
git add .
git commit -m "Describe the specific change"
git push
```

## Video demonstration plan (5-7 minutes)
Follow the assignment's required order:
- ~1 min: GitHub repository, README and commit history.
- ~2-3 min: live app; add, view, edit, delete, strict matching, and persistence after reopening.
- ~2-3 min: explain Activity lifecycle/onResume, SQLite end-to-end, RecyclerView/Adapter, Intents, and strict matching using your actual code.
- ~30-60 sec: justify SQLite as local on-device persistent storage for a pantry app.

Do not submit a silent recording. Record your own voice and use actual screenshots of your running app in the report.

## Submission reminder
The assignment specifies one ZIP containing the complete Android Studio source, the 5-7 minute MP4 video, and the written report, with unnecessary `build/` and `.gradle/` folders excluded. The total ZIP must be <=50 MB. Rename the final ZIP using your student number and surname before Moodle submission.

## Academic integrity
Use this project as a development starting point only if it reflects work you can explain and defend. The assignment declaration states that submitted implementation must be the student's own original work and that the student must be able to explain the code.

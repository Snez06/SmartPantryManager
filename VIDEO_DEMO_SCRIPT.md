# Smart Pantry Manager - 5-7 Minute Demo Script

## 0:00-1:00 GitHub
"This is my public Smart Pantry Manager repository. The README explains the app and how to run it. I am opening the commit history to show incremental development rather than a single final upload."

Show the commit list and briefly explain 3-4 milestones.

## 1:00-3:30 Live app
1. Launch Pantry screen.
2. Add an ingredient and show it in the RecyclerView.
3. Edit the ingredient and save the change.
4. Add the remaining ingredients needed for one seeded recipe.
5. Open Suggested Recipes and show the recipe appears only when every ingredient is present in sufficient quantity.
6. Delete one required ingredient and refresh/return to Suggestions. Show the recipe disappears.
7. Open the recipe detail screen.
8. Return to Pantry and delete an ingredient.
9. Close/reopen the app and show stored pantry data is still present.
10. Open Settings and toggle Almost-There.
11. Trigger a validation error with an empty name or invalid quantity.

## 3:30-6:15 Code explanation
### Activity lifecycle
Point to `PantryListActivity.onResume()` and explain that the list is reloaded whenever the Activity resumes, so edits made on another screen appear when the user returns.

### SQLite
Point to `PantryDBHelper.onCreate()` and explain the three tables: pantry items, recipes, and recipe ingredients. Explain that pantry records are stored on-device and therefore remain after the app closes.

### RecyclerView + Adapter
Point to `PantryAdapter` and explain the ViewHolder pattern: `onCreateViewHolder()` inflates the item layout and `onBindViewHolder()` displays the current pantry item and connects edit/delete actions.

### Intents
Point to the code that puts `ingredient_id` or `recipe_id` into an Intent, then explain how the destination Activity reads that value.

### Strict matching
Point to `PantryDataSource.getSuggestions()`. Explain that every recipe ingredient is checked; a missing ingredient or insufficient quantity sets `canMake` to false. Explain kg/g and L/ml conversion and singular/plural normalization.

## 6:15-7:00 Database justification
"I chose SQLite because this app is local, works without an account or network connection, and needs reliable CRUD persistence for pantry data. SQLiteOpenHelper also fits the persistent-data techniques covered in the module guide."

End by returning to the running app and showing the final Pantry/Recipes screen.

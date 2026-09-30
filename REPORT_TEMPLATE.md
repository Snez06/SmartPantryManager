# Smart Pantry Manager - Written Report Template

> Replace placeholders with your own details and **real screenshots from your running app**. Do not claim a test or screenshot was completed until you have actually performed it.

## Cover Page
- App: Smart Pantry Manager
- Name and Surname: Sinetemba Xhosa
- Student ITS No: 402412872
- Module: Mobile App Development 700
- Date: 30/09/2026

## 1. Introduction
Describe the food-waste problem and the purpose of tracking leftover pantry ingredients and matching recipes strictly to available ingredients.

## 2. System Design
### 2.1 Screen flow
Pantry List -> Add/Edit Ingredient -> Pantry List
Pantry List -> Suggested Recipes -> Recipe Detail
Pantry List -> Settings

### 2.2 Data model
`pantry_item(_id, name, quantity, unit, expiry_date)`

`recipe(_id, name, steps)`

`recipe_ingredient(_id, recipe_id, ingredient_name, quantity, unit)`

Explain the relationship between recipe and recipe_ingredient.

## 3. Screenshots and Core Functions
- Pantry list
- Add ingredient
- Validation error
- Edit ingredient
- Delete ingredient
- Suggested recipes with a strict match
- Suggested recipes after removing one required ingredient
- Recipe detail
- Settings
- Persistence after reopening



## 6. Conclusion and Reflection
Explain what you learned about Activities, lifecycle, layouts, Intents, adapters, SQLite, validation and testing. State realistic future improvements.

## 7. References
Use Harvard style consistently. Include only sources you actually consulted.

# Static-Web-App-Character-api
Assignment #3 character api

This project is a REST API built using Spring Boot, JPA, and PostgreSQL.
The API allows users to manage video game characters.

## Installation

1 Clone the repository  
2 Configure the database connection in application.properties  
3 Run the Spring Boot application  

## API Endpoints

GET /characters  
Returns all characters.

GET /characters/{id}  
Returns a character by ID.

POST /characters  
Adds a new character.

PUT /characters/{id}  
Updates a character.

DELETE /characters/{id}  
Deletes a character.

GET /characters/category/{universe}  
Returns characters from a specific universe.

GET /characters/search?name=substring  
Searches characters whose name contains the given text.

## Demo Video

(https://uncg-my.sharepoint.com/:v:/g/personal/jcosoh_uncg_edu/IQC995GeUDlFRod7BCOICmj3AU2ujfHtA9GwI48zSt7_4pY?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&email=SENTINI%40uncg.edu&e=z9lia2)
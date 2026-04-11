<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Character</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<nav class="navbar">
    <a href="/characters">Home</a>
    <a href="/characters/createForm">Add a Character</a>
</nav>

<h1>Update Character</h1>

<form method="POST" action="/characters/update">

    <!-- IMPORTANT: hidden ID -->
    <input type="hidden" name="characterId" value="${character.characterId}">

    <label>Name:</label>
    <input type="text" name="name" value="${character.name}" required>

    <label>Universe:</label>
    <input type="text" name="universe" value="${character.universe}" required>

    <label>Species:</label>
    <input type="text" name="species" value="${character.species}" required>

    <label>Age:</label>
    <input type="number" name="age" value="${character.age}" required>

    <label>Description:</label>
    <textarea name="description" required>${character.description}</textarea>

<label>Image:</label>
<input type="text" name="image" value="${character.image}" required>

    <br><br>

    <button type="submit">Update Character</button>

</form>

<br>
<a href="/characters">Back to List</a>

</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add a Character</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<nav class="navbar">
    <a href="/characters">Home</a>
    <a href="/characters/createForm">Add a Character</a>
</nav>

<h1>Add a New Character</h1>

<form class="form" method="POST" action="/character/create">
    <input type="text" name="name" placeholder="Character Name" required>
    <input type="text" name="universe" placeholder="Universe" required>
    <input type="text" name="role" placeholder="Role" required>
    <input type="text" name="imageUrl" placeholder="Image URL" required>
    <input type="text" name="image" placeholder="Image filename (e.g. batman.jpg)" required>
    <textarea name="description" placeholder="Short Description" required></textarea>
    <button type="submit">Submit</button>
</form>

</body>
</html>
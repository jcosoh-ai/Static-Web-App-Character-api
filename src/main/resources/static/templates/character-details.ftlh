<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Character Details</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<nav class="navbar">
    <a href="/characters">Home</a>
    <a href="/characters/createForm">Add a Character</a>
</nav>

<h1>Character Details</h1>
<p>Select a character to view their full details.</p>

<div class="grid">
    <#list characters as character>
    <div class="${character.type}" data-name="${character.name}">
        <h3>${character.name}</h3>
        <p>${character.universe}</p>
        <img src="/images/${character.image}" alt="${character.name}" width="200">
        <a href="/details/${character.slug}">View ${character.name}</a>
    </div>
    </#list>
</div>

</body>
</html>
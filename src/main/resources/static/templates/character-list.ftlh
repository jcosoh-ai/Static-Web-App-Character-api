<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Character Gallery</title>
    <link rel="stylesheet" href="/css/style.css">
    <script defer src="/js/search.js"></script>
</head>

<body>

   <nav class="navbar">
    <a href="/characters">Home</a>
    <a href="/characters/createForm">Add a Character</a>
</nav>

    <h1>Fictional Character Gallery</h1>

    <input type="text" id="searchInput" placeholder="Search characters...">

    <div class="grid">
        <#list characters as character>
        <div class="${character.type}" data-name="${character.name}">
<img src="/images/${character.image}" alt="${character.name}" width="150">            <h3>${character.name}</h3>
            <p>Universe: ${character.universe}<br>Role: ${character.role}</p>
            <a href="/details/${character.id}.html">View Details</a>
        </div>
        </#list>
    </div>

</body>

</html>

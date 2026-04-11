<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<nav class="navbar">
    <a href="/characters">Home</a>
    <a href="/characters/createForm">Add a Character</a>
</nav>

<div style="text-align:center; margin-top:50px;">

    <h1>⚠️ Oops! Something went wrong</h1>

    <h2>Status Code: ${status}</h2>

    <p>
        <strong>Error:</strong> ${error}
    </p>

    <p>
        ${message!"Something unexpected happened."}
    </p>

    <br>

    <a href="character-list">
        <button>Go Back Home</button>
    </a>

</div>

</body>
</html>
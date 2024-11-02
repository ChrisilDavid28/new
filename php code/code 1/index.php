<?php
session_start();

// Initialize comments array in session
if (!isset($_SESSION['comments'])) {
    $_SESSION['comments'] = [];
}

// Handle form submission
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $name = htmlspecialchars($_POST['name']);
    $comment = htmlspecialchars($_POST['comment']);
    
    // Add the comment to the session array
    $_SESSION['comments'][] = ['name' => $name, 'comment' => $comment];
    
    // Optionally, redirect to the comments display page
    header('Location: comments.php');
    exit;
}
?>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Comment System</title>
</head>
<body>
    <div class="wrap">
        <h1>Comment System</h1>
        <form id="form" method="post">
            <label>
                <span>Name *</span>
                <input type="text" name="name" required>
            </label>
            <br>
            <label>
                <span>EMAIL *</span>
                <input type="text" name="name" required>
            </label>
            <br>
            <label>
                <span>Your comment *</span>
                <textarea name="comment" required></textarea>
            </label>
            <input type="submit" value="Submit Comment">
        </form>
        <br>
        <form action="comments.php" method="get">
            <input type="submit" value="View Comments">
        </form>
    </div>
</body>
</html>

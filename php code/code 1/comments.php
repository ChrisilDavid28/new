<?php
session_start();
?>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Stored Comments</title>
</head>
<body>
    <div class="wrap">
        <h1>Stored Comments</h1>
        <a href="index.php">Go Back</a>
        <div class="comment-block">
            <?php if (!empty($_SESSION['comments'])): ?>
                <?php foreach ($_SESSION['comments'] as $comment): ?>
                    <div class="comment-item">
                        <h3><?php echo htmlspecialchars($comment['name']); ?> <span>said...</span></h3>
                        <p><?php echo htmlspecialchars($comment['comment']); ?></p>
                    </div>
                    <hr>
                <?php endforeach; ?>
            <?php else: ?>
                <p>No comments yet.</p>
            <?php endif; ?>
        </div>
    </div>
</body>
</html>

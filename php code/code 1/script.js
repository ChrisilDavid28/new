$(document).ready(function(){
    var form = $('#form');
    var submit = $('#submit');
    var comments = []; // In-memory storage for comments

    form.on('submit', function(e) {
        e.preventDefault();

        // Collect data from the form
        var name = $('#comment-name').val();
        var mail = $('#comment-mail').val();
        var comment = $('#comment').val();

        // Create a new comment object
        var newComment = {
            name: name,
            mail: mail,
            comment: comment
        };

        // Add the new comment to the in-memory array
        comments.push(newComment);

        // Append the new comment to the comment block
        $('.comment-block').append(`
            <div class="comment-item">
                <div class="comment-avatar">
                    <img src="https://www.gravatar.com/avatar/${md5(mail)}" alt="avatar">
                </div>
                <div class="comment-post">
                    <h3>${name} <span>said...</span></h3>
                    <p>${comment}</p>
                </div>
            </div>
        `);

        // Reset the form
        form.trigger('reset');
    });
});

// Helper function to generate MD5 hash for Gravatar
function md5(string) {
    // A simple implementation of MD5 hash function
    // You can replace this with a proper MD5 library for production use
    return string; // Placeholder
}

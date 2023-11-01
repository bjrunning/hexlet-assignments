<!-- BEGIN -->
@import exercise.dto.posts.EditPostPage
@param EditPostPage page
@template.layout.page(
content = @`
    <form action="/posts" method="post">
        <div class="mb-3">
            <label class="form-label">
                ${page.getName()}
                <input type="text" class="form-control" name="name" />
            </label>
        </div>
        <div class="mb-3">
            <label class="form-label">
                ${page.getBody()}
            </label>
            <textarea class="form-control" required name="body"></textarea>
        </div>
        <input type="submit" class="btn btn-primary" value="Edit" />
    </form>
`
)
<!-- END -->

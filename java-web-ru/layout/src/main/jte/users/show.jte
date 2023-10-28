<!-- BEGIN -->
@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(
content = @`
    <h3>${page.getUser().getFirstName()} ${page.getUser().getLastName()}</h3>
    <div>${page.getUser().toString()}</div>
`
)
<!-- END -->

@import exercise.dto.LoginPage
@import exercise.util.NamedRoutes
@param LoginPage page

<!-- BEGIN -->
<form action="${NamedRoutes.buildSessionPath()}" method="post">
    @if(page != null)
        <h3>${page.getError()}</h3>
    @endif
    <input type="text" placeholder="Name" name="name" />
    <input type="password" placeholder="Password" name="password" />
    <input type="submit" />
</form>
<!-- END -->

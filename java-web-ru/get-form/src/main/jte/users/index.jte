<!-- BEGIN -->
@import exercise.dto.users.UsersPage
@param UsersPage page
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <title>Homework</title>
</head>
<body>
@for(var user : page.getUsers())
    <div>${user.getFirstName()} ${user.getLastName()}</div>
@endfor
<form action="/users" method="get">
    <input type="search" name="term" value="${page.getTerm()}" />
    <input type="submit" value="Search" />
</form>
</body>
</html>
<!-- END -->

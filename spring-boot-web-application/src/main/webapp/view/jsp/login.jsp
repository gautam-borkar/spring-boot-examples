<html>
  <head>
    <title>Login</title>
  </head>

  <body>
    ${errorMessage}
    <form action="/login" method="post" >
      <input type="text" name="username" />
      <input type="password" name="password" />
      <input type="submit" />
    </form>
  </body>
</html>
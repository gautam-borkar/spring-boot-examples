<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
  <title>Todo List for ${username}</title>
</head>

<body>
  <br>
  <table>
    <caption>Here is ${username} todo list :- </caption>
    <thead>
      <tr>
        <th>Description</th>
        <th>Target date</th>
        <th>Complete</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${todoList}" var="todo">
        <tr>
          <td>${todo.description}</td>
          <td>${todo.targetDate}</td>
          <td>${todo.isDone}</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  <br>
  <a href="/todo">Click here</a> to add your TODO.
</body>

</html>
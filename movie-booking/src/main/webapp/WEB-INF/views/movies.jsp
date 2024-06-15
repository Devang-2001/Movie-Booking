<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Movies</title>
</head>
<body>
    <h2>Available Movies</h2>
    <table>
        <thead>
            <tr>
                <th>Title</th>
                <th>Genre</th>
                <th>Showtime</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="movie" items="${movies}">
                <tr>
                    <td>${movie.title}</td>
                    <td>${movie.genre}</td>
                    <td>${movie.showtime}</td>
                    <td><a href="selectSeats?movieId=${movie.id}">Select Seats</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>

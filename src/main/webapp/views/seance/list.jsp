<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="col-12">
                <form method="post" action="/seance">
                    <input name="date" class="datepicker" id="datepicker"/>
                    <input type="submit" value="Find">
                </form>
                <%--@elvariable id="seance" type="pl.coderslab.entity.Seance"--%>
                <table class="table table-striped table-dark table-bordered table-hover">
                    <thead>
                    <tr>
                        <th scope="col">Movie</th>
                        <th scope="col">Date</th>
                        <th scope="col">Cinema hall</th>
                        <th scope="col">Reservation</th>
<%--                        <sec:authorize access="isAuthenticated()">
                            <th scope="col">Action</th>
                        </sec:authorize>--%>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${seances}" var="seance">
                        <tr>
                            <td><a href="/movie/${seance.movie.id}">${seance.movie.title}</a></td>
                            <td><fmt:formatDate value="${seance.date}" pattern="yyyy-MM-dd HH:mm"/></td>
                            <td>${seance.cinemaHall.name}</td>
                            <td><a href="/reservation/new?seanceId=${seance.id}">Reservation</a></td>
<%--                            <sec:authorize access="isAuthenticated()">
                                <td><a class="confirm btn btn-warning" href="/seance/edit/${seance.id}">Edit</a></td>
                            </sec:authorize>--%>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
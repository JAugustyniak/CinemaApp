<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="col-12">
                <%--@elvariable id="cinemaHall" type="pl.coderslab.entity.CinemaHall"--%>
                <table class="table table-striped table-dark table-bordered table-hover">
                    <thead>
                    <tr>
                        <th scope="col">Name</th>
                        <th scope="col">Number of seats</th>
                        <th scope="col">Edit</th>
                       <%-- <th scope="col">Delete</th>--%>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${halls}" var="cinemaHall">
                        <tr>
                            <td>${cinemaHall.name}</td>
                            <td>${cinemaHall.numberOfRows * cinemaHall.seatsInRow}</td>
                            <td><a class="confirm btn btn-warning" href="/hall/edit/${cinemaHall.id}">Edit</a></td>
                        <%--<td><a class="confirm btn btn-warning" href="/hall/delete/${cinemaHall.id}">Delete</a></td>--%>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
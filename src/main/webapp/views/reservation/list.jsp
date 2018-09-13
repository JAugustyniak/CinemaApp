<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="col-12">
                <%--@elvariable id="reservation" type="pl.coderslab.entity.Reservation"--%>
                <table class="table table-striped table-dark table-bordered table-hover">
                    <thead>
                    <tr>
                        <th scope="col">Seance</th>
                        <th scope="col">Number of reserved seats</th>
                        <th scope="col"></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${reservations}" var="reservation">
                        <tr>
                            <td>${reservation.seance.movie.title} - <fmt:formatDate value="${reservation.seance.date}" pattern="yyyy-MM-dd HH:mm"/></td>
                            <td>${reservation.seats.size()}</td>
                            <td><a href="/reservation/cancel/${reservation.id}">Cancel reservation</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
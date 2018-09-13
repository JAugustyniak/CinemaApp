<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="col-7 col-lg-offset-1">
                <h3>Wybierz miejsca</h3>
                <%--@elvariable id="reservation" type="pl.coderslab.entity.Reservation"--%>
                <form:form modelAttribute="reservation" method="post" action="/reservation/add">
                    <div class="row">
                        <form:errors path="*"/>
                        <c:forEach items="${seats}" var="seat">
                            <div class='seat <c:if test="${not seat.available}">not-</c:if>available'
                                 data-seat-id="${seat.id}">
                                    ${seat.seatNumber}
                            </div>
                        </c:forEach>
                        <form:hidden path="seance" value="${seance}"/>
                        <form:hidden path="seats" value="seats" id="reserved-seats"/>
                    </div>
                    <div class="row">
                        <input type="submit" value="Save" class="btn btn-primary" id="reservation-button">
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
<!-- .container -->
<%@ include file="../footer.jsp" %>

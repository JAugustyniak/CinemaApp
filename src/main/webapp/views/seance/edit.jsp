<%--
<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="entry-content">
                <div class="col-5">
                    &lt;%&ndash;@elvariable id="seance" type="pl.coderslab.entity.Seance"&ndash;%&gt;
                    <form:form modelAttribute="seance" method="post" action="/seance/edit">
                        <form:errors path="*"/>
                        <div class="form-group">
                            <label for="date">Date</label>
                            <form:input path="date" class="form-control" id="date" placeholder="dd-mm-yyyy hh:mm"/>
                        </div>
                        <div class="form-group">
                            <label for="movie">Movie</label>
                            <form:select path="movie" class="form-control" id="movie">
                                <c:forEach items="${movies}" var="movie">
                                    <option value="${movie.id}">${movie.title}</option>
                                </c:forEach>
                            </form:select>
                        </div>
                        <div class="form-group">
                            <label for="cinemaHall">Movie</label>
                            <form:select path="cinemaHall" class="form-control" id="cinemaHall">
                                <c:forEach items="${cinemaHalls}" var="hall">
                                    <option value="${hall.id}">${hall.name}</option>
                                </c:forEach>
                            </form:select>
                        </div>
                        <form:hidden path="id" value="${seance.id}" />
                        <form:hidden path="seats" value="${seance.seats}" />
                        <input type="submit" value="Save" class="btn btn-primary">
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
--%>

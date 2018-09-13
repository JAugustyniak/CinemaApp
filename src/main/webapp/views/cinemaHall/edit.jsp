<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="entry-content">
                <div class="col-5">
                    <%--@elvariable id="cinemaHall" type="pl.coderslab.entity.CinemaHall"--%>
                    <form:form modelAttribute="cinemaHall" method="post" action="/hall/edit">
                        <form:errors path="*"/>
                        <div class="form-group">
                            <label for="name">Cinema hall name</label>
                            <form:input path="name" class="form-control" id="name" placeholder="Cinema hall name"/>
                        </div>
                        <div class="form-group">
                            <label for="rows">Number of rows</label>
                            <form:input path="numberOfRows" class="form-control" id="rows"
                                        placeholder="Number of rows"/>
                        </div>
                        <div class="form-group">
                            <label for="seatsInRow">Seats in row</label>
                            <form:input path="seatsInRow" class="form-control" id="seatsInRow"
                                        placeholder="Number seats in rows"/>
                        </div>
                        <form:hidden path="id" value="${cinemaHall.id}" />
                        <input type="submit" value="Save" class="btn btn-primary">
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>

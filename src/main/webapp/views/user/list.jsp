<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="col-12">
                <%--@elvariable id="user" type="pl.coderslab.entity.User"--%>
                <table class="table table-striped table-dark table-bordered table-hover">
                    <thead>
                    <tr>
                        <th scope="col">Username</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${users}" var="user">
                        <tr>
                            <td>${user.username}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
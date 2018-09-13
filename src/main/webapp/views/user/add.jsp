<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="entry-content">
                <div class="col-5">
                    <%--@elvariable id="user" type="pl.coderslab.entity.User"--%>
                    <form:form modelAttribute="user" method="post" action="/user/add">
                        <form:errors path="*"/>
                        <div class="form-group">
                            <label for="username">Username</label>
                            <form:input path="username" class="form-control" id="username" placeholder="Username"/>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <form:password path="password" class="form-control" id="password" placeholder="Password"/>
                        </div>
                        <input type="submit" value="Save" class="btn btn-primary">
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>

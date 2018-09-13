<%@ include file="header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="entry-content">
                <div class="col-5">
                    <span>${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</span>
                    <form action="/login" method="post">
                        <div class="form-group">
                            <label for="username">Username</label>
                            <input type="text" name="username" class="form-control" id="username" placeholder="Username">
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" name="password" class="form-control" id="password" placeholder="Password"/>
                        </div>
                        <input type="submit" value="Save" class="btn btn-primary">
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="footer.jsp" %>

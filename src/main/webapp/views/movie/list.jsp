<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="col-12">
                <h2>Movies</h2>
                <%--@elvariable id="movie" type="pl.coderslab.entity.Movie"--%>
                <table class="table table-striped table-dark table-bordered table-hover">
                    <thead>
                    <tr>
                        <th scope="col">Title</th>
                        <th scope="col">Description</th>
                        <th scope="col">Category</th>
                        <th scope="col">Age</th>
                        <th scope="col">Length</th>
                        <th scope="col"></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${movies}" var="movie">
                        <tr>
                            <td>${movie.title}</td>
                            <td>${movie.description}</td>
                            <td>${movie.genre}</td>
                            <td>${movie.age}</td>
                            <td>${movie.length}</td>
                            <td><a href="/movie/${movie.id}">Details</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
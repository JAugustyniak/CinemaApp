<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="entry-content">
                <div class="col-5">
                    <h2>Add movie</h2>
                    <%--@elvariable id="movie" type="pl.coderslab.entity.Movie"--%>
                    <form:form modelAttribute="movie" method="post" action="/movie/edit">
                        <form:errors path="*"/>
                        <div class="form-group">
                            <label for="title">Title</label>
                            <form:input path="title" class="form-control" id="title" placeholder="Movie title"/>
                        </div>
                        <div class="form-group">
                            <label for="description">Description</label>
                            <form:input path="description" class="form-control" id="description"
                                        placeholder="Description"/>
                        </div>
                        <div class="form-group">
                            <label for="genre">Category</label>
                            <form:input path="genre" class="form-control" id="genre"
                                        placeholder="Category"/>
                        </div>
                        <div class="form-group">
                            <label for="length">Length</label>
                            <form:input path="length" class="form-control" id="length"
                                        placeholder="Length"/>
                        </div>
                        <div class="form-group">
                            <label for="age">Age</label>
                            <form:input path="age" class="form-control" id="age"
                                        placeholder="Age"/>
                        </div>
                        <form:hidden path="id" value="${movie.id}" />
                        <input type="submit" value="Save" class="btn btn-primary">
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>

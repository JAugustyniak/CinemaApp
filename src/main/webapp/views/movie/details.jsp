<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <div class="row">
                <%--@elvariable id="movie" type="pl.coderslab.entity.Movie"--%>
                <div class="col-md-6">
                    <figure class="movie-poster"><img src="/resources/dummy/single-image.jpg" alt="#"></figure>
                </div>
                <div class="col-md-6">
                    <h2 class="movie-title">${movie.title}</h2>
                    <ul class="movie-meta">
                        <li><strong>Age:</strong> ${movie.age}</li>
                        <li><strong>Length:</strong> ${movie.length} min</li>
                        <li><strong>Category:</strong> ${movie.genre}</li>
                    </ul>
                    <div class="movie-summary">
                        <p>${movie.description}</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
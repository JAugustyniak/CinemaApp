<%@ include file="header.jsp" %>
<div class="container">
    <div class="page">
        <div class="row">
            <div class="col-md-9">
                <div class="slider">
                    <ul class="slides">
                        <li><a href="#"><img src="/resources/dummy/miss.jpg" alt="Slide 1"></a></li>
                        <li><a href="#"><img src="/resources/dummy/cars.jpg" alt="Slide 2"></a></li>
                        <li><a href="#"><img src="/resources/dummy/to.jpg" alt="Slide 3"></a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-3">
                <div class="row">
                    <div class="col-sm-6 col-md-12">
                        <div class="latest-movie">
                            <a href="#"><img src="/resources/dummy/avengers.jpg" alt="Movie 1"></a>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-12">
                        <div class="latest-movie">
                            <a href="#"><img src="/resources/dummy/bezLitosci.jpg" alt="Movie 2"></a>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- .row -->
        <div class="row">
            <div class="col-sm-6 col-md-3">
                <div class="latest-movie">
                    <a href="#"><img src="/resources/dummy/straznicy.jpg" alt="Movie 3"></a>
                </div>
            </div>
            <div class="col-sm-6 col-md-3">
                <div class="latest-movie">
                    <a href="#"><img src="/resources/dummy/piraci.jpg" alt="Movie 4"></a>
                </div>
            </div>
            <div class="col-sm-6 col-md-3">
                <div class="latest-movie">
                    <a href="#"><img src="/resources/dummy/antmaniosa.jpg" alt="Movie 5"></a>
                </div>
            </div>
            <div class="col-sm-6 col-md-3">
                <div class="latest-movie">
                    <a href="#"><img src="/resources/dummy/spiderman.jpg" alt="Movie 6"></a>
                </div>
            </div>
        </div> <!-- .row -->

        <div class="row">
            <%--@elvariable id="seance" type="pl.coderslab.entity.Seance"--%>
            <table class="table table-striped table-dark table-bordered table-hover">
                <thead>
                <tr>
                    <th scope="col">Movie</th>
                    <th scope="col">Date</th>
                    <th scope="col">Cinema hall</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${seances}" var="seance">
                    <tr>
                        <td><a href="/movie/${seance.movie.id}">${seance.movie.title}</a></td>
                        <td><fmt:formatDate value="${seance.date}" pattern="yyyy-MM-dd HH:mm"/></td>
                        <td>${seance.cinemaHall.name}</td>
                        <td><a href="/reservation/add?seanceId=${seance.id}">Reservation</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <%@ include file="footer.jsp" %>

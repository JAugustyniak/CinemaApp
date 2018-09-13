<%@ include file="../header.jsp" %>
<div class="container">
    <div class="page">
        <div class="content">
            <h2>Potwierdzenie rezerwacji</h2>
            <div class="row">
                <%--@elvariable id="reservation" type="pl.coderslab.entity.Reservation"--%>
                <div class="col-md-6">
                    <ul class="movie-meta">
                        <li><strong>Id rezerwacji:</strong> ${reservation.id}</li>
                        <li><strong>Film:</strong> ${reservation.seance.movie.title}</li>
                        <li><strong>Data seansu:</strong> <fmt:formatDate value="${reservation.seance.date}" pattern="yyyy-MM-dd HH:mm"/></li>
                        <li><strong>Sala:</strong> ${reservation.seance.cinemaHall.name}</li>
                        <li><strong>Ilosc biletow:</strong> ${reservation.seats.size()}</li>
                        <li><strong>Miejsca:</strong> ${seats}</li>
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
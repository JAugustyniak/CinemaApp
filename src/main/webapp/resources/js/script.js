$(function () {
    $('.seat.available').click(function () {
        $(this).toggleClass('selected');
    });

    $("#reservation-button").click(function (e) {
        var selected = $(".seat.selected").map(function () {
            return $(this).data('seat-id');
        }).get();
        if (selected.length == 0) {
            alert("No seats were selected.");
        }
        else {
            document.getElementById('reserved-seats').value = selected;
        }
    });
});

$(function () {
    $("#datepicker").datepicker({
        dateFormat: 'dd/mm/yy',
        todayHighlight: true,
        autoclose: true,
        startDate: new Date(),
        minDate: new Date(),
        maxDate: "+7d"
    });
});

function makeRow(data) {
    var markup = "<tr><td>" + data.name + "</td><td class=\"need\">" + data.color + "</td></tr>";
    $("#result").append(markup)
}

function getInfo(name) {
    $.ajax({
        url: "http://127.0.0.1:8080/admin/getinfo",
        data: ({name: name}),
        success: function asd (data) {
            makeRow(data)
            sum(data.color)
            return data;
        },
        error: function(data) {
            alert("Error" + data);
    }
    })
}

// window.onload = function sum() {
//     var price = 0;
//     $('td .need').each(function(){
//         price += parseInt($('.need', this));
//     });
//     $("#sum").html(price)
// }

function sum(data) {
     var price = parseInt($("#sum").text());
    var dPrice = parseInt(data);
    price += dPrice;
    $("#sum").html(price)
}
$(document).ready(function () {
    let win = true;
    let start = false;
    function lost() {
        if (win && start) {
            win = false;
            start = false;
            $(".boundary").addClass("youlose");
            $("#status").text('Sorry, you lost. :[');


        }
    }

    $(".boundary").mouseover(function () {
        lost();
    });
    $("#maze").mouseleave(function () {
        lost();
    });


    $("#end").mouseover(function () {
        if (win) {
            start = false;
            $("#status").text('You win!');
        }
    });
    $("#start").click(function () {
        win = true;
        start = true;
        $("#status").text('Move mouse to play !');
        $(".boundary").removeClass("youlose");
    });
});

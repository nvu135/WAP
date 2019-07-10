init = function () {
    var puzzleArea = document.getElementById('puzzlearea');
    $("<div id='blank'>").appendTo(puzzleArea);

    var divs = puzzleArea.getElementsByTagName("div");

    // initialize each piece
    for (var i = 0; i < divs.length - 1; i++) {
        var div = divs[i];

        // calculate x and y for this piece
        var x = ((i % 4) * 100);
        var y = (Math.floor(i / 4) * 100);

        // set basic style and background
        div.className = "puzzlepiece";
        div.style.left = x + 'px';
        div.style.top = y + 'px';
        div.style.backgroundImage = 'url("background.jpg")';
        div.style.backgroundPosition = -x + 'px ' + (-y) + 'px';

        // store x and y for later
        div.x = x;
        div.y = y;
        div.type = "puzzle";

    }
    var blank = divs[divs.length - 1];
    blank.x = 300;
    blank.y = 300;
    blank.type = "blank";

    blank.style.left = '300px';
    blank.style.top = '300px';


    $(divs).click(function (event) {
        loopTiles(function (currentTile, blankTile) {
            changetTiles(currentTile, blankTile);
        }, this);
    });

    $(divs).hover(function (event) {
        loopTiles(function (currentTile, blankTile) {
            console.log("log");
            hoverTiles(currentTile);
        }, this);
    }, function (event) {
        $(this).removeClass("movablepiece");
    });

    function loopTiles(action, currentTile) {
        for (var i = 0; i < divs.length; i++) {
            const tempX = currentTile.x - divs[i].x;
            const tempY = currentTile.y - divs[i].y;
            if (((tempX == 100 || tempX == -100) && tempY == 0) || ((tempY == 100 || tempY == -100) && tempX == 0)) {
                if (divs[i].type == "blank") {
                    action(currentTile, divs[i]);
                }
            }
        };
    }

    function hoverTiles(currentTile) {
        $(currentTile).addClass("movablepiece");
    }

    function changetTiles(tile1, tile2) {
        console.log(tile1);
        console.log(tile2);

        let tempTile = {
            x: 0,
            y: 0
        };
        equal(tempTile, tile1);
        equal(tile1, tile2);
        equal(tile2, tempTile);
        drawTile(tile1);
        drawTile(tile2);

    }

    function equal(tile1, tile2) {
        tile1.x = tile2.x;
        tile1.y = tile2.y;
    }

    function drawTile(tile) {
        tile.style.left = tile.x + 'px';
        tile.style.top = tile.y + 'px';
    }
};

window.onload = init;

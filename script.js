window.onload = function() {
    var val = 0;
    var i = 0;
    var circle = document.getElementById("circle");
    // alert(circle);
    while (true) {
        setTimeout(function(){
                circle.style.marginLeft = "800px";
                circle.style.transition = "4s";
                circle.style.transform = "rotate(360deg)";
        },2000);
        setTimeout(function(){
            circle.style.marginLeft = "50px";
            circle.style.transition = "4s";
            circle.style.transform = "rotate(360deg)";
        },5000);
        val = val + i;
        i++;

        if (i==10){
            break
        }
    }
}
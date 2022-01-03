window.onload = function() {
    var circle = document.getElementById("circle");
    // alert(circle);
    setTimeout(function(){
            circle.style.marginLeft = "800px";
            circle.style.transition = "4s";
            circle.style.transform = "rotate(360deg)";
    },2000);
    setTimeout(function(){
        circle.style.marginLeft = "50px";
        circle.style.transition = "4s";
        circle.style.transform = "rotate(360deg)";
    },4000);
}
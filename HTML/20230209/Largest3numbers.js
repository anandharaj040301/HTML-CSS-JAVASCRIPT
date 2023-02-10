function calc() {
    var a,b,c,d,e;
    a=parseInt(document.getElementById("a").value);
    b=parseInt(document.getElementById("b").value);
    c=parseInt(document.getElementById("c").value);
    d=parseInt(document.getElementById("d").value);

e=(a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>b && c>a && c>d)?c:d;
document.getElementById("ans").innerHTML=e+" is the largest Number";  
    
}
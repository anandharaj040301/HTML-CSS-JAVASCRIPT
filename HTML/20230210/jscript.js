function checkOddEven() {
var a;
a=parseInt(document.getElementById("num").value);
if(a%2==0)
{
    document.getElementById("ans").innerHTML=a+" is a Even Number";
}
else{
    document.getElementById("ans").innerHTML=a+" is a Odd Number";
}
    
}
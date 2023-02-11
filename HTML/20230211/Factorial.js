function factorial() {
    var a, fact,i;
    a=parseInt(document.getElementById("num").value);
    fact=1;
    for (i=a; i >= 1; i--) {
        fact = fact*i;
              
    }   
    document.getElementById("Answer").innerHTML="The Factorial of "+a+" is: "+fact;
}
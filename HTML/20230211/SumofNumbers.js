function factorial() {
    var a, sum,i;
    a=parseInt(document.getElementById("num").value);
    sum=1;
    for (i=1; i <= a; i++) {
        sum = sum+i;
              
    }   
    document.getElementById("Answer").innerHTML="The Sum of "+a+" is: "+sum;
}
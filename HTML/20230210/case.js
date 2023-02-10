function calc() {
    var a,b,c,d;
    a=parseInt(document.getElementById("a").value);
    b=parseInt(document.getElementById("b").value);
    d=parseInt(document.getElementById("m").value);
                                    switch (d) {
        case 1:
         c=a+b;
    document.getElementById("ans").innerHTML="The Addition Of "+a+" and "+b+" is "+c;   
            break;
    case 2:
        c=a-b;
        document.getElementById("ans").innerHTML="The Subtraction Of "+a+" and "+b+" is "+c;
    break;
    case 3:
        c=a*b;
        document.getElementById("ans").innerHTML="The Multiplication Of "+a+" and "+b+" is "+c;
    break;
    case 4:
        c=a/b;
        document.getElementById("ans").innerHTML="The Division Of "+a+" and "+b+" is "+c;
    break;
        default:
            alert("select Action")
            break;
    }    
    
    
    
}
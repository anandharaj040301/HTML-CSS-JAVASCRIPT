function fibonacci(){
    var first,second,third,t,i,s;
   
   first=0;
   second=1;
   t=parseInt(document.getElementById("term").value);
   //document.write(first+"<br>");
   //document.write(second+"<br>");
   s=first+","+second;
   for(i=1;i<=t-2;i++){
       third=first+second;
       // document.write(third+"<br>");
      s= s+" , "+third;
       first=second;
       second=third;
   }
   //document.write(s)
   document.getElementById("f").innerHTML="Fibonacci Series :"+s;
   }
function my()
    {
	  
      var min = 29;
      var sec = 59;
        var myTimer=setInterval(function(){myTimer1()},1000);
        function myTimer1()
       {
	   alert("mona");

          document.getElementById("timer").innerHTML = min +" : " + sec ;
         sec--;
          if(sec ==0)
          {
            min--;
            sec = 59;
        
          }
          if(min==0 && sec==1)
          {
              document.getElementById("timer").innerHTML = min +" : " + sec ;
              myStopfunction();
          }
       }
       function myStopfunction()
       {
          sec--;
          document.getElementById("timer").innerHTML = min +" : " + sec ;
          
          clearInterval(myTimer);
          alert("Times up");
       }
       
     
    }
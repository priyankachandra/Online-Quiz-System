function registration()
{
var reg=/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
var reg1=/^\d{10}$/;
var address=document.myform.email.value;
var mob=document.myform.mobile.value;
val=false;
if(reg.test(address)==false)
{
 alert("Inavalid Email ID,try again");

 document.myform.email.focus();
}
else if(reg1.test(mob)==false)
{

alert("Inavalid Mobile Number!!");

 document.myform.mobile.focus();
 return val=false;
 }
else
{
return val=true;
}
return val;
}
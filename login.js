
function onSub()
{
validate=false;
var nam=document.log.uname.value;
var pas=document.log.pass.value;
if(nam==null||nam=="")
{

 alert("user name required");
 document.log.uname.focus();

}
else if(pas=null||pas=="")
{

 alert("password required");
 document.log.pass.focus();

}
else
{
var chk=confirm("are you sure want to login??");
if(chk==true)
{
validate=true;
}
else
{
alert("you stay here");
validate=false;
}
} 																						
return validate;
}
function validate(){
	var flag=false;
	var userName=f1.userName.value
	var userpasswd=f1.userPwd.value
	if(userName==""||userName==null){
		document.getElementById('userErrMsg').innerHTML="* Please enter user Name"
			flag=false;
	}else if(userpasswd==""||userpasswd==null){
		document.getElementById('pwdErrMsg').innerHTML="* Please enter user Password"
			document.getElementById('userErrMsg').innerHTML=""
				flag=false;
	}else{
		flag=true;
	}
	
	return flag;
}

function validatesemployee(){
	var flag=false;
	var empid=reqform.empid.value;
	var fname=reqform.fname.value;
	var lname=reqform.lname.value;
	var email=reqform.emailid.value;
	
    var empregex=/^[0-9]{5}+_+[A-Z]{2}$/;
    if(empregex.test(empid)){
    	return true;
    }else{
    	alert("Your employee id should be of 4 digits followed by _ and followed by 2 upper casecharacters")
    	return false;
    	
    }
    var fnameregex = /^[a-zA-Z ]{2,30}$/;
    if (fnameregex.test(fname)) {
        return true;
    }
    else {
    	alert("Your first name should contain only alphabets minimum 2 and maximum of 30 characters")
        return false;
    }

	 var lnameregex = /^[a-zA-Z ]{2,30}$/;
	    if (lnameregex.test(fname)) {
	        return true;
	    }
	    else {
	    	alert("Your last name should contain only alphabets minimum 2 and maximum of 30 characters")
	        return false;
	    }
		return true;
		
	var emailregex=/^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$/;
	if(emailregex.test(email)){
		return true;
	}else{
		alert("Your email is not valid");
		return false;
	}
	alert("Hi");
}
/**
 * 
 */
function validate(frm) {
	//set vflag to "yes" indicating client side form validations are done 

	frm.vflag.value = "yes";

	//set style to error message
	document.getElementById("pnameErr").innerHTML = "";
	document.getElementById("pageErr").innerHTML = "";
	document.getElementById("pnameErr").style = "color:red";
	document.getElementById("pageErr").style = "color:red";

	//read form data
	var name = frm.pname.value;
	var age = frm.page.value;

	//perform client side form validation
	if (name == "") {
		document.getElementById("pnameErr").innerHTML = "Person Name is Mandatory !";
		frm.pname.focus();
		return false;
	}
	if (age == "") {
		document.getElementById("pageErr").innerHTML = "Person Age is Mandatory !";
		frm.page.focus();
		return false;
	}
	else {
		if (isNaN(age)) {
			document.getElementById("pnameErr").innerHTML = "Person Age Must be Numeric Value";
			frm.page.focus();
			frm.page.value = "";
			return false;
		}
	}
	return true;
}
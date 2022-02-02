/* Task2.js - Add your Java Script Code Here */



function plus(){

	var a = parseFloat(prompt("Please enter the first integer or decimal:"));
	var b = parseFloat(prompt("Please enter the second integer or decimal:"));
	var r = parseFloat(a + b).toFixed(2);
	document.getElementById("mydata").innerHTML = r;

}

function minus(){

	var a = parseFloat(prompt("Please enter the first integer or decimal:"));
	var b = parseFloat(prompt("Please enter the second integer or decimal:"));
	var r = parseFloat(a - b).toFixed(2);
	document.getElementById("mydata").innerHTML = r;

}

function times(){

	var a = parseFloat(prompt("Please enter the first integer or decimal:"));
	var b = parseFloat(prompt("Please enter the second integer or decimal:"));
	var r = parseFloat(a * b).toFixed(2);
	document.getElementById("mydata").innerHTML = r;

}

function divide(){

	var a = parseFloat(prompt("Please enter the first integer or decimal:"));
	var b = parseFloat(prompt("Please enter the second integer or decimal:"));
	var r = parseFloat(a / b).toFixed(2);
	document.getElementById("mydata").innerHTML = r;

}

function factorial(){

	var a = parseInt(prompt("Please enter an integer as the factorial number:"));
	var fac = 1;
	for(var r=1;r<=a;r++){
		fac *= r;
	}
	document.getElementById("mydata").innerHTML = fac;
}

function root(){

	var a = parseFloat(prompt("Please enter an integer or decimal as the base:"));
	var b = parseFloat(prompt("Please enter an integer or decimal as the root"));
	var r = parseFloat(Math.pow(a, 1/b)).toFixed(2);
	document.getElementById("mydata").innerHTML = r;

}

function power(){

	var a = parseFloat(prompt("Please enter an integer or decimal as the base:"));
	var b = parseFloat(prompt("Please enter an integer or decimal as the exponent"));
	var r = parseFloat(Math.pow(a, b)).toFixed(2);
	document.getElementById("mydata").innerHTML = r;

}

function exponential(){

	var a = parseFloat(prompt("Please enter an integer or decimal as the power of e:"));
	var r = parseFloat(Math.exp(a)).toFixed(2);
	document.getElementById("mydata").innerHTML = r;
}

function reset(){

	document.getElementById("mydata").innerHTML = "";

}
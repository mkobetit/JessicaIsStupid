function getUsers() {
	$.ajax({
		  type: "POST",
		  url: "ws/User/getUsers",
		  success: successCallback
		});
	
	

}

function getUsersByLastName() {
	var lastName = $('#lastNameText').val();
	$.ajax({
		  type: "POST",
		  url: "ws/User/getUsersByLastName",
		  data: lastName,
		  success: successCallback
		});

}

function getUsersByGender() {
	var gender = $('#genderText').val();
	$.ajax({
		  type: "POST",
		  url: "ws/User/getUsersByGender",
		  data: gender,
		  success: successCallback
		});

}
function successCallback(success) {
	//console.log(resultUser);
	console.log(success);
	var header = '<tr id = "row0">' +
				'<th id = "firstName"> First Name </th>'
	+'<th id = "middleName"> Middle Name </th>' 
	+ '<th id = "lastName"> Last Name </th>'
	+ '<th id = "gender"> Gender </th>'
	+ '<th id = "emailAddress"> Email Address </th>'
	+ '<th id = "phoneNumber"> Phone Number </th>' 
	+ '<th id = "companyName"> Company </th>'
	+ '<th id = "jobTitle"> Job Title</th>'
	+ '<th id = "salary"> Salary</th> </tr>';
	
	
	$('#usersTable').html(header);
	for(var i = 0; i < success.length; i++) {
		$('#usersTable').append("<tr id = row" + (i+1) +" class = 'alignCenter'> <td> <a target='_blank' href = 'https://www.google.com/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q="+success[i].firstName+"'>"+ success[i].firstName + "</a> </td> <td>"+success[i].middleName+"</td> <td>"+success[i].lastName+"</td> <td>"+success[i].gender+"</td> <td> <a href='mailto:"+success[i].emailAddress+"'> "+success[i].emailAddress +" </a> "+"</td> <td>"+success[i].phoneNumber+"</td> <td> "+success[i].companyName+"</td> <td> "+success[i].jobTitle+"</td> <td> "+success[i].salary+"</td> </tr>");
	}
	
}

$(document).ready(function() {
	getUsers();
});

/*function User() {
	var firstName;
	var middleName;
	var lastName;
	var gender;
	var phoneNumber;
	var emailAddress;
}

var farah = {firstName: 'Farah', middleName: 'Sharmeen', lastName: 'Obaidullah', gender: 'F', phoneNumber: 4042745866, emailAddress: 'farahobaidullah@gmail.com'}

var resultUser = new User();*/








<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<%= application.getContextPath() %>/style.css"/>
</head>
<body>
	<form action="regform" method="post">
	<div class="register-form">
        <h2>Personal Information</h2>
        
        <label>First name</label><br>
        <input type="text" name="firstname" placeholder="Enter First Name">
        <br>
        <label>Last name</label><br>
        <input type="text" name="lastname" placeholder="Enter last Name">
        <br>
        <label>College name</label><br>
        <input type="text" name="college" placeholder="Enter College Name">
        <br>
        <label>Department</label><br>
        <input type="text" name="Department" placeholder="Enter Department Name">
        <br>
        <label>Contact</label><br>
        <input type="text" name="Contact" placeholder="Enter Contact Number">
        <br>
        <label>Email</label><br>
        <input type="email" name="email" placeholder=" Enter email">
        <br>
        <label>Password</label><br>
        <input type="password" name="password" placeholder="Enter password">
        <br>
        <label>Confirm Password</label><br>
        <input type="password" name="confirm_password" placeholder="Enter confirm password" required>
        <br>
        <input type="submit" value="Register">
        
    </div>
    </form>
	
</body>
</html>

	


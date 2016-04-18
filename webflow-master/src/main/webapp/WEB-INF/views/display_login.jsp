<%@ page isELIgnored ="false" %>
 
<html xmlns:form="http://www.springframework.org/tags/form">
 
	<body>
		<form action="${flowExecutionUrl}&_eventId=loginCredentialsEntered" method="post">
		 
			<input type="hidden" name="flowExecutionKey" value="${flowExecutionKey}"/>
			<br/>
			<b>
				Create a new account and then login
			</b>
			<br/>
			<br/>
			<table>
				<tr>
					<td>Login Name:</td>
					<td><input type="text" name="loginName"/></td>
				</tr>
				<tr>
					<td>Password: </td>
					<td><input type="text" name="password"/></td>
				</tr>
			</table>
			 
			<br/>
			<input type="submit" value="Login" />
		 
		</form>
	 
		<a href="/webflow/registerUser">Create New Account</a>
	</body>
</html>
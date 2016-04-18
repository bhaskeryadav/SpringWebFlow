<%@ page isELIgnored ="false" %>
 
<html xmlns:form="http://www.springframework.org/tags/form">
 
	<body>
		<form action="${flowExecutionUrl}&_eventId=accountInformationEntered" method="post">
		 
			<input type="hidden" name="flowExecutionKey" value="${flowExecutionKey} }"/>
			 
			<br/>
			<br/>
			<table>
				<tr>
					<td>New Login Name:</td>
					<td><input type="text" name="loginName"/></td>
				</tr>
				<tr>
					<td>Enter Password: </td>
					<td><input type="text" name="password"/></td>
				</tr>
				<tr>
					<td>Enter DOB: </td>
					<td><input type="text" name="loginDate"/></td>
				</tr>
			</table>
			 
			<br/>
			<input type="submit" value="Submit" />
			 
		</form>
	</body>
</html>
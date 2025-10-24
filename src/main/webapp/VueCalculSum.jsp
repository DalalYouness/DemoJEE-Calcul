
<%@page import="web.CalculModel"%>
<% 
CalculModel model = (CalculModel)request.getAttribute("modelCalcul");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calcul</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div>
		<form action="addition.do" method="post">
			<table>
				<tr>
					<td>first number: </td>
					<td>
						<input type="text" name="number-one" value="<%=model.getNumberOne()%>" autofocus/>
					</td>
				</tr>
				<tr>
					<td>second number: </td>
					<td>
						<input type="text" name="number-two" value="<%=model.getNumberTwo()%>"/>
					</td>
				</tr>
			</table>
			<button type="submit">sum</button>
		</form>
		
	</div>
	<br>
	<div>
			Result : <%=model.getResultSum()%>
	</div>
</body>
</html>

<%@page import="web.CalculModel"%>
<% 
CalculModel model = (CalculModel)request.getAttribute("modelCalcul");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calcul</title>
</head>
<body>
	<div class="calc">
		<form action="addition.do" method="post">
			<table>
				<tr>
					<td>first number: </td>
					<td>
						<input type="text" name="number-one" />
					</td>
				</tr>
				<tr>
					<td>second number: </td>
					<td>
						<input type="text" name="number-two" />
					</td>
				</tr>
			</table>
			<button type="submit">sum</button>
		</form>
		<br>
		<div class = "result">
			Result : <%=model != null ? model.getResultSum() : 0%>
		</div>
	</div>
</body>
</html>
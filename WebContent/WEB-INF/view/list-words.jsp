<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="pl">

<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
	<title>List Words</title>	
	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>All Words</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<table>
				<tr>
					<th>English</th>
					<th>English Pronunciation</th>
					<th>Polish</th>
					<th>Active</th>
					
				</tr>
				
				<c:forEach var="tempWord" items="${words}">
					<tr>
						<td> ${tempWord.english} </td>
						<td> ${tempWord.pronunciation} </td>
						<td> ${tempWord.polish} </td>
						<td> ${tempWord.active} </td>
					</tr>
				</c:forEach>
				
				
				
				
			</table>
		
		
		
		</div>
	
	</div>
	
	
	
	
</body>
</html>
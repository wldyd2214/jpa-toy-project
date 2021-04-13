<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Movie World</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> 
	<script> 
		$.ajax({ 
			type: "GET", 
			url: "/valueTest", 
			success: (data) => { 
				console.log(data); 
				$('#contents').html(data); 
			} 
		}); 
	</script>
</head>
<body>
	<h1>Movie</h1>
	<div id="contents">
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

.clearfix:after, .clearfix:before {
	display: table;
	content: "@";
}

.clearfix:after {
	clear: both;
	overflow: hidden;
	
}

.demo {
	width: 250px;
	border: 1px solid #007;
	padding: 10px;
	margin: 20px auto;
}

li {
	list-style: none outside none;
	float: left;
	height: 20px;
	line-height: 20px;
	width: 20px;
	border-radius: 10px;
	text-align: center;
	background: #007;
	color: green;
	margin-right: 5px;
}
</style>
</head>
<body>
	<ul class="clearfix demo">
		<li>1</li>
		<li>2</li>
		<li>3</li>
		<li>4</li>
		<li>5</li>
		<li>6</li>
		<li>8</li>
		<li>9</li>
		<li>10</li>
	</ul>
	<p class="clearfix">你好漂亮啊！</p>
</body>
</html>
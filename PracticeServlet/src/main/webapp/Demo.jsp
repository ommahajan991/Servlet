<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- Declarative Tag  -->
	<%!int a = 10;
	List<Integer> list = new ArrayList<>();

	void m1() {
		System.out.println("Hello");
	}

	int sum(int a, int b) {
		return a + b;
	}%>

	<!-- Scriptlet Tag -->
	<%
	System.out.println(a);
	int b = 20;
	%>
	
	<!-- Expression Tag -->
	<h1>Number :<%= a %>  <%= b %></h1>
	<h1>Sum :<%= sum(a,b) %></h1>
	
</body>
</html>
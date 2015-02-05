<html>
<body>
<h2>Hello World!</h2>
<%
    String name =(String)request.getAttribute("name");
%>
<span><%= name %></span>
</body>
</html>

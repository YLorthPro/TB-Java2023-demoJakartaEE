<%@ page import="be.bstorm.ylorth.tbarlondemojakartaee.Personne" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: y_lor
  Date: 02-10-23
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Personne p = (Personne) request.getAttribute("test"); %>
<% List<Personne> liste = (List<Personne>) request.getAttribute("liste"); %>
        <html>
<head>
    <title>Title</title>
</head>
<body>
    <h1> Vous même! </h1>
<%= p.nom %> - <%= p.prenom%>
<ul>
<% for (Personne personne : liste) {%>
    <li><%= personne.nom%> - <%= personne.prenom%></li>
<%}%>
</ul>
</body>
</html>
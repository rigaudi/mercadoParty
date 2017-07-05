<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
	<head>
		<jsp:include page="etiquetasHead.jsp" />
	</head>

<body>
<c:if test="${session == null}" > 	
	<jsp:include page="navegador.jsp" />
</c:if>

<c:if test="${session != null}" > 	
	<jsp:include page="navegadorlogueado.jsp" />
</c:if>


<table class="table table-striped">
<thead>

<tr>
		<th>Nombre</th>
		<th>Email</th>
		<th>Zona</th>
</tr>
</thead>
<tbody>
	<c:forEach items="${consumidor}" var="p">
	
	<tr>
		<th>${p.nombre}</th>
		<th>${p.email}</th>
		<th>${p.zona}</th>
		<th>
            <form:form action="eliminaConsumidor" method="POST" modelAttribute="consumidor">
				<input name="email" id="email" type="hidden" value="${p.email}" size="50" type="text">
				<button class="btn btn-warning"  name="Submit" value="Login" type="Submit">Eliminar</button>
			</form:form>
         <th>
</tr>
	</c:forEach>
</tbody>



</table>


	
	



<jsp:include page="footer.jsp" />

</body>
</html>
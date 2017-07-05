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
		<th>Tipo Servicio</th>
		<th>Titulo</th>
		<th>Imagen</th>
		<th>Imagen</th>
		<th>Imagen</th>
		<th>Descripcion</th>

</tr>
</thead>
<tbody>
	<c:forEach items="${publicacion}" var="p">
	
	<tr>
		<th>${p.tipoServicio}</th>
		<th>${p.titulo}</th>
		<th><img src="img/${p.imagen1}" class="img-thumbnail" alt="imagen3" width="50" height="30"></th>
		<th><img src="img/${p.imagen2}" class="img-thumbnail" alt="imagen3" width="50" height="30"></th>
		<th><img src="img/${p.imagen3}" class="img-thumbnail" alt="imagen3" width="50" height="30"></th>
		<th>${p.descripcion}</th>
		<th>
			<form:form action="detalleProducto" method="POST" modelAttribute="publicacion">
<%-- 				<input name="name" value="${Name}" size="50" type="text"> --%>
				<button class="btn btn-primary"  name="Submit" value="Login" type="Submit">Ver Detalle</button>  			
			</form:form>
		</th>
</tr>
	</c:forEach>
	
<%-- <c:set var="ID" value="5"/>    --%>
<%-- <c:set var="Name" value="Riyana"/>    --%>
<!-- <td align="right">Name</td>     -->
<%-- <td><input name="name" value="${Name}" size="50" type="text"></td> --%>
<!-- </tbody> -->



</table>
	



<jsp:include page="footer.jsp" />

</body>
</html>
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
		<th>Nombre Usuario</th>
		<th>Publicacion Referida</th>
		<th>Descripcion del Mensaje</th>
		<th>Destinatario Mensaje</th>

</tr>
</thead>
<tbody>
	<c:forEach items="${mensaje}" var="m">
	
	<tr>
		<th>${m.consumidorEmisor.getNombre()}</th>
		<th>${m.publicacion.getDescripcion()}</th>		
		<th>${m.texto}</th>
		<th>${m.consumidorReceptor.getNombre()}</th>

</tr>
	</c:forEach>
	
<%-- <c:set var="ID" value="5"/>    --%>
<%-- <c:set var="Name" value="Riyana"/>    --%>
<!-- <td align="right">Name</td>     -->
<%-- <td><input name="name" value="${Name}" size="50" type="text"></td> --%>
<!-- </tbody> -->



</table>

<!-- <table class="table table-striped"> -->

<!-- <thead> -->

<!-- <tr> -->
<!-- 		<th>Nombre del usuario</th> -->
<!-- 		<th>Publicacion</th> -->
<!-- 		<th>Texto del mensaje</th> -->

<!-- </tr> -->
<!-- </thead> -->
<!-- <tbody> -->
<%-- 	<c:forEach items="${mensaje}" var="m"> --%>
	
<!-- 	<tr> -->
<%-- 		<th>${m.consumidorEmisor}</th> --%>
<%-- 		<th>${m.publicacion}</th> --%>
<%-- 		<th>${p.texto}</th> --%>
<!-- 		<th> -->
<%-- 			<form:form action="verDetalle" method="POST" modelAttribute="publicacion"> --%>
<%-- 				<input name="name" value="${Name}" size="50" type="text"> --%>
<!-- 				<button class="btn btn-primary"  name="Submit" value="Login" type="Submit">Ver Detalle</button>  			 -->
<%-- 			</form:form> --%>
<!-- 		</th> -->
<!-- </tr> -->
<%-- 	</c:forEach> --%>
	



<!-- </table> -->
	



<jsp:include page="footer.jsp" />

</body>
</html>
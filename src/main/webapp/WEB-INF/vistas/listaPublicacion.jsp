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
				<input name="id" id="id" type="hidden" value="${p.id}" size="50" type="text">
				<input name="tipoServicio" id="tipoServicio" type="hidden" value="${p.tipoServicio}" size="50" type="text">
				<input name="titulo" id="titulo" type="hidden" value="${p.titulo}" size="50" type="text">
				<input name="imagen1" id="imagen1" type="hidden" value="${p.imagen1}" type="file" class="file" data-preview-file-type="any" required>
				<input name="imagen2" id="imagen2" type="hidden" value="${p.imagen2}" type="file" class="file" data-preview-file-type="any" required>
				<input name="imagen3" id="imagen3" type="hidden" value="${p.imagen3}" type="file" class="file" data-preview-file-type="any" required>
				<input name="descripcion" id="descripcion" type="hidden" value="${p.descripcion}" size="500" type="text">
				<button class="btn btn-primary"  name="Submit" value="Login" type="Submit">Ver Detalle</button>
  			
			</form:form>
		</th>
		<th>
            <form:form action="eliminaPublicacion" method="POST" modelAttribute="publicacion">
				<input name="id" id="id" type="hidden" value="${p.id}" size="50" type="text">
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
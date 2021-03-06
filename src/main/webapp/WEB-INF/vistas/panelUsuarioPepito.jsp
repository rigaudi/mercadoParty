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

<div class="container">
<div class="col-md-6 col-md-offset-3">
<h1>Bienvenido: <small>${session}</small></h1>


<div class="item">
<a href="/mercadoParty/agregarPublicacion" class="btn btn-info" role="button">Crear Publicación</a>
</div><br>


<div class="item">
<a href="/mercadoParty/listaPublicacion" class="btn btn-info" role="button">Ver mis Publicaciones</a>
</div><br>

<div class="item">
<a href="/mercadoParty/listarMensajes" class="btn btn-info" role="button">Ver Mensajes</a>
</div><br>


<div class="item">
<a href="/mercadoParty/listaConsumidores" class="btn btn-info" role="button">Ver Usuarios</a>
</div><br>


</div>
</div>
<jsp:include page="footer.jsp" />

</body>
</html>
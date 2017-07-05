<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
	<head>
	
	   <jsp:include page="etiquetasHead.jsp" />
        <link href="css/fileinput.min.css" media="all" rel="stylesheet" type="text/css" />
        <script src="js/fileinput.min.js" type="text/javascript"></script>
       	
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
			
			<h1>Bienvenido <small>${session}</small></h1>
		
		<form:form action="/mercadoParty/cargarProducto"  method="POST" modelAttribute="publicacion">
			<div class="form-group"> 
				<label for="sel1">Elige qué quieres publicar:</label>
					<select class="form-control" name="tipoServicio" id="tipoServicio">
						  <option>Catering</option>
						  <option>Alquiler de equipamiento</option>
						  <option>Alquiler de indumentaria</option>
						  <option>Salones y quintas</option>
						  <option>Entretenimiento</option>
						  <option>Bebidas</option>
						  <option>Vehiculos para eventos</option>
						  <option>Servicios audiovisuales</option>
					</select>
			</div>


				<div class="form-group">
					  <label for="sel1">Titulo de publicacion:</label>
					  <input type="text" class="form-control" name="titulo" id="titulo">
				</div>


				<div class="form-group">
                    <input name="imagen1" id="imagen1" type="file" class="file"  data-preview-file-type="any" required>
                </div>
                
                <div class="form-group">
                    <input name="imagen2" id="imagen2" type="file" class="file" data-preview-file-type="any" required>
                </div>
                
                <div class="form-group">
                    <input name="imagen3" id="imagen3" type="file" class="file"  data-preview-file-type="any" required>
                </div>


			

				<div class="form-group">
				  <label for="comment">Descripcion:</label>
				  <textarea class="form-control" rows="5" name="descripcion" id="descripcion"></textarea>
				</div>
			
				
				

				<div class="form-group">
					<button class="btn btn-primary" type="submit">Guardar</button>
					<button class="btn btn-default" type="reset">Limpiar todo</button>
				</div>
				</form:form>
				</div>

			
	</div>

	
 
<!--  <script>
$("#file-3").fileinput({
showCaption: false,
browseClass: "btn btn-primary btn-lg",
fileType: "any"
});
</script>-->



		<jsp:include page="footer.jsp" />
	</body>
</html>
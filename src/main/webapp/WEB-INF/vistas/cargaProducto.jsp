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

<jsp:include page="navegador.jsp" />

			<div class="container">
			<div class="col-md-6 col-md-offset-3">
			
			<h1>�Describe tu servicio!</h1>
		
		<form enctype="multipart/form-data">
			<div class="form-group">
				<label for="sel1">Elige qu� quieres publicar:</label>
					<select class="form-control" id="sel1">
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
					  <label for="usr">Titulo de publicacion:</label>
					  <input type="text" class="form-control" id="usr">
				</div>


				<div class="form-group">
                    <input id="file-1" type="file" class="file" multiple=true data-preview-file-type="any">
                </div>
                
                <div class="form-group">
                    <input id="file-2" type="file" class="file" multiple=true data-preview-file-type="any">
                </div>
                
                <div class="form-group">
                    <input id="file-3" type="file" class="file" multiple=true data-preview-file-type="any">
                </div>


			

				<div class="form-group">
				  <label for="comment">Descripcion:</label>
				  <textarea class="form-control" rows="5" id="comment"></textarea>
				</div>

				<div class="form-group">
					<button class="btn btn-primary">Guardar</button>
					<button class="btn btn-default" type="reset">Limpiar todo</button>
				</div>
				</form>
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
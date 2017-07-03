<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
	<head>
		<jsp:include page="etiquetasHead.jsp" />
	</head>

<body>

<jsp:include page="navegador.jsp" />

<div class="col-sm-12 col-md-12 col-lg-12">
    		<!-- product -->
			<div class="product-content product-wrap clearfix product-deatil">
				<div class="row">
						<div class="col-md-5 col-sm-12 col-xs-12 ">
							<div class="product-image"> 
								<div id="myCarousel-2" class="carousel slide">
								<ol class="carousel-indicators">
									<li data-target="#myCarousel-2" data-slide-to="0" class=""></li>
									<li data-target="#myCarousel-2" data-slide-to="1" class="active"></li>
									<li data-target="#myCarousel-2" data-slide-to="2" class=""></li>
								</ol>
								<div class="carousel-inner">
									<!-- Slide 1 -->
									<div class="item active">
										<img src="img/${imagen1}" class="img-thumbnail" alt="imagen1" width="306" height="295">
									</div>
									<!-- Slide 2 -->
									<div class="item">
										<img src="img/${imagen2}" class="img-thumbnail" alt="imagen2" width="306" height="295">
									</div>
									<!-- Slide 3 -->
									<div class="item">
										<img src="img/${imagen3}" class="img-thumbnail" alt="imagen3" width="306" height="295">
									</div>
								</div>
								<a class="left carousel-control" href="#myCarousel-2" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"></span> </a>
								<a class="right carousel-control" href="#myCarousel-2" data-slide="next"> <span class="glyphicon glyphicon-chevron-right"></span> </a>
								</div>
							</div>
						</div>
						<div class="col-md-7 col-sm-12 col-xs-12">
					
						<h2 class="name">
							${titulo}
						<br>							
							<small>${tipoServicio}</small>
						</h2>
						<hr>
						<h3 class="price-container">Direccion: <span>${direccion}</span></h3>
						<div class="certified">
							<ul>
								<li><a href="javascript:void(0);">Telefono<span>${telefono}</span></a></li>
								<li><a href="javascript:void(0);">Email<span>${email}</span></a></li>
							</ul>
						</div>
						<hr>
						<div class="description description-tabs">
							<ul id="myTab" class="nav nav-pills">
								<li class="active"><a href="#more-information" data-toggle="tab" class="no-margin">Descripcion</a></li>
								<li class=""><a href="#specifications" data-toggle="tab">Mensajes</a></li>
							</ul>
							<div id="myTabContent" class="tab-content">
								<div class="tab-pane fade active in" id="more-information">
									<br>
									<strong>Descripcion:</strong>
									<p>${descripcion}</div>
								<div class="tab-pane fade" id="specifications">
								
								<form:form action="/mercadoParty/cargarMensaje" method="POST" modelAttribute="mensaje">
							  <textarea class="form-control" rows="4" id="texto" name="texto"></textarea>
								  <div class="col-sm-12 col-md-6 col-lg-6"> <br>
										<button class="btn btn-primary" type="submit">Preguntar</button>
								  </div>
								  </form:form>
							</div>
						</div>
						
					</div>
				</div>
			</div>


		</div>
		<jsp:include page="footer.jsp" />
		</div>
		
		
</body>

</html>
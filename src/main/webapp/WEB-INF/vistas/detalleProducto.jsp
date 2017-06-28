<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
	<head>
		<jsp:include page="etiquetasHead.jsp" />
	</head>

<body>

<%-- <jsp:include page="navegador.jsp" /> --%>

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
										<img src="img/nadialogo.png" alt="">
									</div>
									<!-- Slide 2 -->
									<div class="item">
										<img src="img/fotprod1.png" alt="">
									</div>
									<!-- Slide 3 -->
									<div class="item">
										<img src="img/fotprod2.png" alt="">
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
							<small>${session}</small>
						</h2>
						<hr>
						<h3 class="price-container">direccion:${direccion}</h3>
						<div class="certified">
							<ul>
								<li><a href="javascript:void(0);">Telefono<span>15-4041-5647</span></a></li>
								<li><a href="javascript:void(0);">Email<span>nadia@gmail.com</span></a></li>
							</ul>
						</div>
						<hr>
						<div class="description description-tabs">
							<ul id="myTab" class="nav nav-pills">
								<li class="active"><a href="#more-information" data-toggle="tab" class="no-margin">Descripcion</a></li>
								<li class=""><a href="#specifications" data-toggle="tab">Especificaciones</a></li>
							</ul>
							<div id="myTabContent" class="tab-content">
								<div class="tab-pane fade active in" id="more-information">
									<br>
									<strong>Descripcion:</strong>
									<p>${descripcion}</div>
								<div class="tab-pane fade" id="specifications">
								<div id="googleMap" style="width:100%;height:300px;"></div>

								<script>
								function myMap() {
								var mapProp= {
								    center:new google.maps.LatLng(51.508742,-0.120850),
								    zoom:5,
								};
								var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
								}
								</script>

								<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCfBI8EI81Fw61zGM_AnySP-UHglgCWs9w&callback=myMap"></script>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-12 col-md-6 col-lg-6">
									<a href="javascript:void(0);" class="btn btn-success btn-lg">Contactar</a>
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
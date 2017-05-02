<!DOCTYPE html>
<html lang="es">
	<head>
	  <title>Mercado Party</title>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css"> 
	  <link rel="stylesheet" href="css/estilos.css">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>

<body>

	<div id="navegador" class="navbar navbar-inverse">
		<div class="col-sm-3">
			<a href="#"><img class="img-responsive" id="logo" src="img/logo.png" alt="logo"/></a>
		</div>
  
	<div class="col-sm-6">
	            <div class="input-group" id="adv-search">
                <input type="text" class="form-control" placeholder="Buscar Servicios" />
                <div class="input-group-btn">
                    <div class="btn-group" role="group">
                        <div class="dropdown dropdown-lg">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><span class="caret"></span></button>
                            <div class="dropdown-menu dropdown-menu-right" role="menu">
                                <form class="form-horizontal" role="form">
                                  <div class="form-group">
                                    <label for="filter">Filtrar por Zona</label>
                                    <select class="form-control">
                                        <option value="0" selected>Capital Federal</option>
                                        <option value="1">Zona Sur</option>
                                        <option value="2">Zona Oeste</option>
                                        <option value="3">Zona Norte</option>
                                    </select>
                                  </div>
                                  <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                </form>
                            </div>
                        </div>
                        <button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                    </div>
                </div>
            </div>
  </div>
  
	<div class="col-sm-3">      
	<ul class="nav navbar-nav navbar-right">
        <li>
			<a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a>
		</li>
     </ul>
	</div>
</div>

<div id="myCarousel" class="carousel slide" data-ride="carousel">

    <!-- Imagenes del slider -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="img/publicidad01.png" alt="Image">
        <div class="carousel-caption">
        </div>      
      </div>

      <div class="item">
        <img src="img/publicidad02.png" alt="Image">
        <div class="carousel-caption">
        </div>      
      </div>

      <div class="item">
        <img src="img/publicidad03.png" alt="Image">
        <div class="carousel-caption">
        </div>      
      </div>

      <div class="item">
        <img src="img/publicidad01.png" alt="Image">
        <div class="carousel-caption">
        </div>      
      </div>

    </div>


    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>

<jsp:include page="footer.jsp" />

</body>
</html>
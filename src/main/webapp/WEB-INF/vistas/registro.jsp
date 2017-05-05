<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	  <title>Registrate!</title>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">

	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css"> 

	  <link rel="stylesheet" href="css/estilos.css">

	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	  		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
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
	</nav>


<!-- Inicio Form-->



<div class="container">
			<div class="row main">
				<div class="main-login main-center">

				 <ul class="nav nav-tabs">

				<li class="active" ><a data-toggle="tab" href="#menu1">Registrate</a></li>
				    <li><a data-toggle="tab" href="#menu2">Registrate como Empresa</a></li>
				    </ul>

					<form:form action="registrar-usuario" method="POST" modelAttribute="usuario">

			
					
					  <div class="tab-content">
    					<div id="menu1" class="tab-pane fade in active">
     					 <h3>Comenzá ahora, miles de servicios te estan esprando!</h3>

						
						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">1.</span>
									  <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Nombre" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

								
						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">2.</span>
									  <input type="text" class="form-control" name="apellido" id="apellido" placeholder="Apellido" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

		
						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">3.</span>
									  <input type="text" class="form-control" name="email" id="email" placeholder="Correo Electrónico" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">4.</span>
									  <input type="text" class="form-control" name="password" id="password" placeholder="Contraseña" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

							<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">5.</span>
									  <input type="text" class="form-control" name="confirm" id="confirm" placeholder="Confirme Contraseña" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

						</div>


							    <div id="menu2" class="tab-pane fade">
							      <h3>Sé parte de Mercado Party y obtené beneficios</h3>
							      <p>*Los datos que ingresará a continuación son propios de su Empresa/Comercio. Tenga en cuenta que estos datos pueden ser públicos dentro de sus publicaciones.</p>
				
			

							    <div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">1.</span>
									  <input type="text" class="form-control" name="nombreEmp" id="nombreEmp" placeholder="Nombre" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

								
						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">2.</span>
									  <input type="text" class="form-control" name="emailEmp" id="emailEmp" placeholder="Correo Electrónico" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

		
						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">3.</span>
									  <input type="text" class="form-control" name="tel" id="tel" placeholder="Teléfono" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

						<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">4.</span>
									  <input type="text" class="form-control" name="direccion" id="direccion" placeholder="Dirección" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>

							<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">5.</span>
									    <select class="form-control" >
									   <option default>¿En qué zona se encuentra?</option>
                                        <option value="0">Capital Federal</option>
                                        <option value="1">Zona Sur</option>
                                        <option value="2">Zona Oeste</option>
                                        <option value="3">Zona Norte</option>
                                    </select>
									</div>
								</div>
						</div>

								<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">6.</span>
									  <input type="text" class="form-control" name="passwordEmp" id="passwordEmp" placeholder="Contraseña" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>


								<div class="form-group">
								<div class="cols-sm-10">
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">7.</span>
									  <input type="text" class="form-control" name="confirmEmp" id="confirmEmp" placeholder="Confirme Contraseña" aria-describedby="basic-addon1">
									</div>
								</div>
						</div>


						</div>

						</div>

						<div class="form-group ">
<!-- 							<a href="http://deepak646.blogspot.in" target="_blank" type="button" id="button" class="btn btn-primary btn-lg btn-block login-button">Register</a> -->
						 <button type="submit" class="btn btn-success">Registrar</button>
						</div>
<!--             <button type="submit" class="btn btn-success">Registrar</button> -->						
					</form:form> 
				</div>
			</div>
		</div>

		 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>


<jsp:include page="footer.jsp" />

</body>
</html>
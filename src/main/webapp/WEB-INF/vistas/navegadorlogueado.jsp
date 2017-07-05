<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

		<nav id="navegador" class="navbar navbar-inverse">
		<div class="col-sm-3" id="primercolumna">
			<a href="/mercadoParty/"><img class="img-responsive" id="logo" src="img/logo.png" alt="logo"/></a>
		</div>
  
		<div class="col-sm-6" id="segundacolumna">
	            <div class="input-group" id="adv-search">
	            <form:form class="form-horizontal" action="/mercadoParty/listaProductos" method="POST">
                <input type="text" name="palabraBuscada" id="palabraBuscada" class="form-control" placeholder="Buscar Servicios"/>
                </form:form>
                <div class="input-group-btn">
                    <div class="btn-group" role="group">
                        <div class="dropdown dropdown-lg">
                            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><span class="caret"></span></button>
                            <div class="dropdown-menu dropdown-menu-right" role="menu">
                                <form:form class="form-horizontal" action="/mercadoParty/listaProductos" method="POST">
                                  <div class="form-group">
                                    <label for="filter">Filtrar Por Servicio</label>
                                    <select name="tipoServicio" class="form-control">
                                        <option selected>Todos los servicios</option>
                                        <option value="Catering">Catering</option>
                                        <option value="Alquiler de equipamiento">Alquiler de equipamiento</option>
                                        <option value="Alquiler de indumentaria">Alquiler de indumentaria</option>
                                        <option value="Salones y quintas">Salones y quintas</option>
                                        <option value="Entretenimiento">Entretenimiento</option>
                                        <option value="Bebidas">Bebidas</option>
                                        <option value="Vehiculos para eventos">Vehiculos para eventos</option>
                                        <option value="Servicios audiovisuales">Servicios audiovisuales</option>
                                    </select>
                                  </div>
                                  <button value="/mercadoParty/listaProductos" type="submit"  class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
          </div>
  
		<div class="col-sm-3" id="terceracolumna">      
		<ul class="nav navbar-nav navbar-right">
      <li><a href="/mercadoParty/panelUsuario"><span class="glyphicon glyphicon-user"></span> Panel de Control</a></li>
      <li><a href="/mercadoParty/logout"><span class="glyphicon glyphicon-log-out"></span> Cerrar Sesíon</a></li>
    </ul>
		</div>
	</nav>
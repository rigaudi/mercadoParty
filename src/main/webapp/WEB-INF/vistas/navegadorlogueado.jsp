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
                                    <label for="filter">Filtrar Por Zona</label>
                                    <select class="form-control">
                                        <option value="0" selected>Todas las zonas</option>
                                        <option value="1">Capital Federal</option>
                                        <option value="2">Zona Sur</option>
                                        <option value="3">Zona Norte</option>
                                        <option value="4">Zona Oeste</option>
                                    </select>
                                  </div>
                                  <div class="form-group">
                                    <label for="contain">Descripcion contiene</label>
                                    <input type="text" name="palabraBuscada" id="palabraBuscada" class="form-control" placeholder="Buscar Servicios"/>
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
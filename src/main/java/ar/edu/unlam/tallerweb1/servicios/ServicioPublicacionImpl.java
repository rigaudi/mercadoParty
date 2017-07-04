package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.PublicacionDao;
import ar.edu.unlam.tallerweb1.modelo.Publicacion;

@Service ("servicioPublicacion")
@Transactional
public class ServicioPublicacionImpl implements ServicioPublicacion{

	@Inject
	private PublicacionDao servicioPublicacionDao;

	@Override
	public void guardarPublicacion(Publicacion publicacion) {
		
		servicioPublicacionDao.guardarPublicacion(publicacion);
		
	}

	@Override
	public Publicacion consultarPublicacion(Publicacion publicacion) {
		return servicioPublicacionDao.consultarPublicacion (publicacion);
	}

	@Override
	public Publicacion consultarPublicacionPorId(Long id) {
		// TODO Auto-generated method stub
		return servicioPublicacionDao.consultarPublicacionPorId(id);
	}
	
	@Override
	public List<Publicacion> ListaPublicacion() {
		// TODO Auto-generated method stub
		return servicioPublicacionDao.ListaPublicacion();
	}




	
}
//
//@Service ("servicioPublicacion")
//@Transactional
//public class ServicioPublicacionImpl implements ServicioPublicacion{
//	
//	@Inject
//	private SessionFactory session;
//
//	@Override
//	public void guardarPublicacion(Publicacion publicacion) {
//		// TODO Auto-generated method stub
//
//		session.getCurrentSession().save(publicacion);
//	}
//	
//	@Override
//	public Publicacion consultarPublicacion(Publicacion publicacion) {
//		// TODO Auto-generated method stub
//		
//		final Session session = this.session.getCurrentSession();
//		
//		return (Publicacion) session.createCriteria(Publicacion.class)
//				.add(Restrictions.eq("id",1L)).uniqueResult();
//		
//	}
//
//}
package ar.edu.unju.escmi.tp8.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.escmi.tp8.collections.CollectionEmpresa;
import ar.edu.unju.escmi.tp8.model.Empresa;
import ar.edu.unju.escmi.tp8.service.IEmpresaService;

@Service
public class EmpresaServiceImp implements IEmpresaService {
	@Autowired
	private Empresa empresa;

	@Override
	public void guardarEmpresa(Empresa empresa) {
		
		CollectionEmpresa.empresas.add(empresa);
		System.out.println("Empresa guardada correctamente: "+ empresa);
		
	}

	@Override
	public List<Empresa> obtenerEmpresas() {
		return CollectionEmpresa.empresas;
	}

	@Override
	public void modificarEmpresa(Empresa empresa) {
		for(Empresa emp : CollectionEmpresa.empresas) {
			if(emp.getId() == empresa.getId()) {
				emp.setNombre(empresa.getNombre());
				emp.setRubro(empresa.getRubro());
				emp.setEstado(empresa.getEstado());
				emp.setCantidadEmpleados(empresa.getCantidadEmpleados());
				emp.setNroSedes(empresa.getNroSedes());
				emp.setTelefono(empresa.getTelefono());
				emp.setDireccion(empresa.getDireccion());
				System.out.println("Se modificó la empresa: "+ emp);
			}
		}
	}

	@Override
	
	public void eliminarEmpresa(int id) {
		
		Optional<Empresa> emp = CollectionEmpresa.empresas.stream().filter(e -> e.getId()== id).findFirst();
		if(emp.isPresent()) {
			CollectionEmpresa.empresas.remove(emp.get());
			System.out.println("se eliminó la empresa con el id "+id);
		}
		
	}

	@Override
	public void modificarParcialmenteEmpresa(Empresa empresa) {
		for(Empresa emp : CollectionEmpresa.empresas) {
			if(emp.getId() == empresa.getId()) {
				if(empresa.getNombre()!=null)emp.setNombre(empresa.getNombre());
				if(empresa.getRubro()!=null)emp.setRubro(empresa.getRubro());
				if(empresa.getEstado()!=null)emp.setEstado(empresa.getEstado());
				if(empresa.getCantidadEmpleados()!=null)emp.setCantidadEmpleados(empresa.getCantidadEmpleados());
				if(empresa.getNroSedes()!=null)emp.setNroSedes(empresa.getNroSedes());
				if(empresa.getTelefono()!=null)emp.setTelefono(empresa.getTelefono());
				if(empresa.getDireccion()!=null)emp.setDireccion(empresa.getDireccion());
				System.out.println("Se modificó parcialmente la empresa: "+emp);
				
			}
		}
		
	}

	@Override
	public Empresa buscarEmpresaId(int id) {
		Optional<Empresa> emp = CollectionEmpresa.empresas.stream().filter(e -> e.getId()== id).findFirst();
		if(emp.isPresent()) {
			return emp.get();
		}
		return null;
	}

	@Override
	public Empresa getEmpresa() {
		return empresa;
	}
	
	
}
	
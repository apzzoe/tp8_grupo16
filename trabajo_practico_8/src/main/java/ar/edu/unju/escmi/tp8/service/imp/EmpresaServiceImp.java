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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empresa buscarEmpresaId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa getEmpresa() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
	
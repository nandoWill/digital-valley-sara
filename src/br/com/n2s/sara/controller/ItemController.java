package br.com.n2s.sara.controller;

import java.util.List;

import br.com.n2s.sara.dao.DAOItem;
import br.com.n2s.sara.model.Item;

public class ItemController {

	private DAOItem daoItem;
	
	public ItemController() {
		daoItem = new DAOItem();
	}

	public void criar(Item item){
		daoItem.create(item);
	}

	public List<Item> listar(){
		return daoItem.read();
	}

	public List<Item> listar(int id){
		return daoItem.readById(id);
	}

	public Item buscar(int idItem){
		return daoItem.getItem(idItem);
	}

	public void atualizar(Item item){
		daoItem.update(item);
	}

	public void deletar(int idItem){
		daoItem.delete(idItem);
	}

}
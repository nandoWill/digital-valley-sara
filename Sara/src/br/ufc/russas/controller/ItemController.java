package br.ufc.russas.controller;

import java.util.List;

import br.ufc.russas.dao.DAOItem;
import br.ufc.russas.model.Item;

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

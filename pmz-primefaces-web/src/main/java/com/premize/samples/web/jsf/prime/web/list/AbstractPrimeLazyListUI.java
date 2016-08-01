package com.premize.samples.web.jsf.prime.web.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

/**
 * Clase Abstracta que implementa {@link LazyDataModel}
 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
 * @project afe-web
 * @class AbstractPrimeLazyListUI
 * @date 9/05/2013
 *
 */
public abstract class AbstractPrimeLazyListUI<T> extends LazyDataModel<T>{

	private static final String DESCENDING_SYMBOL = "-";
	private static final String ASCENDING_SYMBOL = "+";
	private static final long serialVersionUID = 2061125652393924828L;
	
	

	/**
	 * Metodo para ser implementado por la clase concreta que debe retornar el valor de la consulta
	 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
	 * @date 9/05/2013
	 * @param first
	 * @param pageSize
	 * @param multiSortMeta
	 * @param filters
	 * @return
	 */
	public abstract List<T> findDataModelEntries(int first, int pageSize, String sort,
			Map<String, String> filters) ;
	/**
	 * Metodo para ser implementado por la clase concreta que debe retornar el numero de rows de la consulta
	 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
	 * @date 9/05/2013
	 * @param filters
	 * @return
	 */
	public abstract int countDataModelEntries(Map<String, String> filters);


	/** 
	 * @see org.primefaces.model.LazyDataModel#load(int, int, java.util.List, java.util.Map)
	 */
	@Override
	public List<T> load(int first, int pageSize, List<SortMeta> multiSortMeta,
			Map<String, String> filters) {
		List<String> sortData = new ArrayList<String>();
		for (SortMeta sortMeta : multiSortMeta) {
			SortOrder sortOrder = sortMeta.getSortOrder();
			String valueField = sortMeta.getSortField();
			valueField = getFieldSorted(sortOrder, valueField);
			sortData.add(valueField);
		}
		
		setRowCount(countDataModelEntries(filters));
		return findDataModelEntries(first, pageSize, StringUtils.join(sortData,','), filters);
		
	}

	/** 
	 * @see org.primefaces.model.LazyDataModel#load(int, int, java.lang.String, org.primefaces.model.SortOrder, java.util.Map)
	 */
	@Override
	public List<T> load(int first, int pageSize, String sortField,
			SortOrder sortOrder, Map<String, String> filters) {
		String sortedField = null;
	    if (sortField != null) {
	        sortedField = getFieldSorted(sortOrder, sortField);
		}
		setRowCount(countDataModelEntries(filters));
		return findDataModelEntries(first, pageSize, sortedField, filters);
	}
	
	/**
	 * Obtener el campo con +/- dependiendo del orden
	 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
	 * @date 9/05/2013
	 * @param sortOrder
	 * @param valueField
	 * @return
	 */
	private String getFieldSorted(SortOrder sortOrder, String valueField) {
		switch (sortOrder) {
		case ASCENDING:
			return ASCENDING_SYMBOL + valueField;
		case DESCENDING:
		default:
			return DESCENDING_SYMBOL + valueField;
		}
	}
	
	/**
	 * Obtener el Servlet Context
	 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
	 * @date 9/05/2013
	 * @return
	 */
	protected ServletContext getServletContext(){
		return (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
	}
	
	/** 
	 * @see org.primefaces.model.LazyDataModel#getRowData(java.lang.String)
	 */
	@Override
	public abstract T getRowData(String rowKey) ;
	/** 
	 * @see org.primefaces.model.LazyDataModel#getRowKey(java.lang.Object)
	 */
	@Override
	public abstract Object getRowKey(T object) ;
}

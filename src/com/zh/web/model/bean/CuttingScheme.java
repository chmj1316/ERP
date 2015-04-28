package com.zh.web.model.bean;

import com.zh.core.model.IDataObject;

/**
* @Title: CuttingScheme.java 
* @Package com.zh.web.model.bean 
* @Description: 切割方案
* @date 2015年4月28日 下午3:26:27 
* @author taozhaoping 26078
* @author mail taozhaoping@gmail.com
* @version V1.0
 */
public class CuttingScheme extends IDataObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1288177167525441866L;

	private Integer id;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 主产品物料数量
	 */
	private Integer mainProducts;
	
	/**
	 * 主产品物料数量
	 */
	private Integer manNumber;
	
	/**
	 * 副产品物料
	 */
	private Integer byProducts;
	
	/**
	 * 副产品物料数量
	 */
	private Integer byNumber;
	
	/**
	 * 状态
	 */
	private Integer enabled;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMainProducts() {
		return mainProducts;
	}

	public void setMainProducts(Integer mainProducts) {
		this.mainProducts = mainProducts;
	}

	public Integer getManNumber() {
		return manNumber;
	}

	public void setManNumber(Integer manNumber) {
		this.manNumber = manNumber;
	}

	public Integer getByProducts() {
		return byProducts;
	}

	public void setByProducts(Integer byProducts) {
		this.byProducts = byProducts;
	}

	public Integer getByNumber() {
		return byNumber;
	}

	public void setByNumber(Integer byNumber) {
		this.byNumber = byNumber;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	
	
}

package com.tiagodeveloper.enumarator;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(shape = Shape.OBJECT)
public enum SetorEnum {
	TI(1, "Tecnologia da informação"), RH(2, "Recursos humanos");

	private Integer codigo;
	private String descricao;

	private SetorEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

//	@JsonCreator
//	public static SetorEnum forValue(@JsonProperty("codigo") Integer codigo) {
//		return null;
//	}
	@JsonCreator
	public static SetorEnum getSetorEnumByCodigo(@JsonProperty("codigo") Integer codigo){
		
		for(SetorEnum e : SetorEnum.values()){
			if(e.getCodigo().equals(codigo)){
				return e;
			}
		}
		return null;
	}

}

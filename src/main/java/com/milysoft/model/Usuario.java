package com.milysoft.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class Usuario implements Serializable{
	private static final long serialVersionUID=1L;
}

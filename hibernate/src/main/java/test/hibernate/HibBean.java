package test.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class HibBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aid", updatable = false, nullable = false)
	private int aid;
	private String name;
	private String color;
	private EmbeddableTest fullName = new EmbeddableTest();
	
	public EmbeddableTest getFullName() {
		return fullName;
	}
	public void setFullName(EmbeddableTest fullName) {
		this.fullName = fullName;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public HibBean(int aid, String name, String color,EmbeddableTest fullName) {
		super();
		this.aid = aid;
		this.name = name;
		this.color = color;
		this.fullName = fullName;
	}
	public HibBean(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "HibBean [aid=" + aid + ", name=" + name + ", color=" + color + "]";
	}

}
